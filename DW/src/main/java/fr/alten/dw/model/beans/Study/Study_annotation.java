/**
 * 
 */
package fr.alten.dw.model.beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.lang.String;


/**
 * 
 * @author Thomas Decamp
 *
 */
public class Study_annotation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -316617630017594315L;

	@Id
	private transient ObjectId _id;
	
	private int instance_key;
	private long study_key;
	private String code_key;
	private String comment;
	private int rev_number;
	private String author_last_name;
	private String author_first_name;
	private Date date_creation;
	private String code;
	private String code_label;
	private Timestamp dt_last_update_dwh;
	private String author_user_name;
	
	
	public int getInstance_key() {
		return instance_key;
	}

	public void setInstance_key(int instance_key) {
		this.instance_key = instance_key;
	}

	public long getStudy_key() {
		return study_key;
	}

	public void setStudy_key(long study_key) {
		this.study_key = study_key;
	}

	public String getCode_key() {
		return code_key;
	}

	public void setCode_key(String code_key) {
		this.code_key = code_key;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRev_number() {
		return rev_number;
	}

	public void setRev_number(int rev_number) {
		this.rev_number = rev_number;
	}

	public String getAuthor_last_name() {
		return author_last_name;
	}

	public void setAuthor_last_name(String author_last_name) {
		this.author_last_name = author_last_name;
	}

	public String getAuthor_first_name() {
		return author_first_name;
	}

	public void setAuthor_first_name(String author_first_name) {
		this.author_first_name = author_first_name;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode_label() {
		return code_label;
	}

	public void setCode_label(String code_label) {
		this.code_label = code_label;
	}

	public Timestamp getDt_last_update_dwh() {
		return dt_last_update_dwh;
	}

	public void setDt_last_update_dwh(Timestamp dt_last_update_dwh) {
		this.dt_last_update_dwh = dt_last_update_dwh;
	}

	public String getAuthor_user_name() {
		return author_user_name;
	}

	public void setAuthor_user_name(String author_user_name) {
		this.author_user_name = author_user_name;
	}
}
