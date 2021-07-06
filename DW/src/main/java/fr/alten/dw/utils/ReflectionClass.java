/**
 *
 */
package fr.alten.dw.utils;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Utilities method for reflection and introspection
 *
 * @author Andy Chabalier
 *
 */
@SuppressWarnings("rawtypes")
public class ReflectionClass {

	/**
	 * Recursive method used to find all classes in a given directory and
	 * sub-directory.
	 *
	 * @param directory   The base directory
	 * @param packageName The package name for classes found inside the base
	 *                    directory
	 * @return The list of class find
	 * @throws ClassNotFoundException if the class cannot be located
	 */
	public static List<Class> findClasses(final File directory, final String packageName)
			throws ClassNotFoundException {
		final List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		final File[] files = directory.listFiles();
		for (final File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(ReflectionClass.findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(
						Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}

	/**
	 * Scan all fields of the provided class to fetch the column id
	 *
	 * @param classToExtract the class that we want to get the column id
	 * @return the name of the column id
	 */
	public static String getBeanId(final Class classToExtract) {
		for (final Field field : classToExtract.getDeclaredFields()) {
			final Annotation[] annotations = field.getAnnotations();
			final String annotationList = Arrays.asList(annotations).toString();
			// We check if the field have ID and Column annotation. That means this field is
			// the column id.
			if (annotationList.contains(Id.class.getCanonicalName())
					&& annotationList.contains(Column.class.getCanonicalName())) {
				return field.getAnnotation(Column.class).name();
			}
		}
		return null;
	}

	/**
	 * Scans all classes accessible from the context class loader which belong to
	 * the given package and sub-packages.
	 *
	 * @param packageName The base package
	 * @return The classes
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws IOException            If I/O errors occur
	 */
	public static Class[] getClasses(final String packageName) throws ClassNotFoundException, IOException {
		final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		final String path = packageName.replace('.', '/');
		final Enumeration<URL> resources = classLoader.getResources(path);
		final List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			final URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		final ArrayList<Class> classes = new ArrayList<Class>();
		for (final File directory : dirs) {
			classes.addAll(ReflectionClass.findClasses(directory, packageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}
}
