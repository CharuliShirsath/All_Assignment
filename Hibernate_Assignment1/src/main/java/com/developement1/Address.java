package com.developement1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int id;
	private int flat_no;
	private String city;
	private int pincode;
	private String state;
	@OneToOne
	private Employee emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlat_no() {
		return flat_no;
	}
	public void setFlat_no(int flat_no) {
		this.flat_no = flat_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address() {}
	public Address(int id, int flat_no, String city, int pincode, String state, Employee emp) {
	
		this.id = id;
		this.flat_no = flat_no;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.emp = emp;
	}
	
	
	
	

}
