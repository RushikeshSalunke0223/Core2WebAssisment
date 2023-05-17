package com.Employees1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class dipartment {
	
	@Id
	@Column(name="D_id")
	private int id;
	
	@Column(name="D_name")
	private String name;
	
	@Column(name="D_isOpen")
	private boolean isOpen;
	
	@Transient
	private String currentEmp;
	
	public dipartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public dipartment(int id, String name, boolean isOpen, String currentEmp) {
		super();
		this.id = id;
		this.name = name;
		this.isOpen = isOpen;
		this.currentEmp = currentEmp;
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
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public String getCurrentEmp() {
		return currentEmp;
	}
	public void setCurrentEmp(String currentEmp) {
		this.currentEmp=currentEmp;	
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
