package com.Many_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="T_Id")
	private int id;
	
	@Column(name="T_Name")
	private String Name;
	
	@Column(name="T_Subject")
	private String Subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Trainner [id=" + id + ", Name=" + Name + ", Subject=" + Subject + "]";
	}
	
	
}
