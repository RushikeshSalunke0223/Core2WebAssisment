package com.Employees1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name="Emp_ID")
	private int id;
	
	@Column(name="Emp_name")
	private String name;
	
	@Column(name="Emp_city")
	private String city;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return this.id+" : "+this.name+" : "+this.city;
	}
	
	

}