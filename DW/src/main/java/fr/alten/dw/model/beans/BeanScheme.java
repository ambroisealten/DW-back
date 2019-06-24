/**
 *
 */
package fr.alten.dw.model.beans;

import java.util.HashMap;

/**
 * @author Andy Chabalier
 *
 */
public class BeanScheme {

	private String name;
	private HashMap<String, String> fields = new HashMap<String, String>();

	public BeanScheme(final String name) {
		super();
		this.name = name;
	}

	public void addField(final String field, final String type) {
		this.fields.put(field, type);
	}

	public HashMap<String, ?> getFields() {
		return this.fields;
	}

	public String getName() {
		return this.name;
	}

	public void setFields(final HashMap<String, String> fields) {
		this.fields = fields;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
