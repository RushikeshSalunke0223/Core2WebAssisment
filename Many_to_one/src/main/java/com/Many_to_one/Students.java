package com.Many_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="S_Id")
	private int id;
	
	@Column(name="S_Name")
	private String name;
	
	@Column(name="S_Course")
	private String course;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Trainner trainner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Trainner getTrainner() {
		return trainner;
	}

	public void setTrainner(Trainner trainner) {
		this.trainner = trainner;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", course=" + course + ", trainner=" + trainner + "]";
	}
	
	

}
