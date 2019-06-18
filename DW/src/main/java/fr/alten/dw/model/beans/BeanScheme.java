/**
 * 
 */
package fr.alten.dw.model.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy Chabalier
 *
 */
public class BeanScheme {

	private String name;
	private List<String> fields = new ArrayList<String>();

	public BeanScheme(String name) {
		super();
		this.name = name;
	}

	public void addField(String field) {
		this.fields.add(field);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

}
