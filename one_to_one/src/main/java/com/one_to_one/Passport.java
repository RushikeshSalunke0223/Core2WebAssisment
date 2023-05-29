package com.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="P_Id")
	private int id;
	
	@Column(name="P_Country")
	private String Country_name;
	
	@OneToOne
	private Employee employee;
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", Country_name=" + Country_name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry_name() {
		return Country_name;
	}
	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
