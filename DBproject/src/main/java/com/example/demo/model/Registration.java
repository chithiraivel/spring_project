package com.example.demo.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/*@Entity
@Table(name="StudentReg")
public class Registration {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int StudentId;
	private String name;
	private String address;
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}*/

@Entity
@Table(name="customer")
public class Registration {
	@jakarta.persistence.Id
	@Column(name="customerId",length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int customerId;
	
	@Column(name="customerName",length=100)
	private String customerName;
	
	@Column(name="mobileNo",length=20)
	private int mobile;
	
	
	public Registration(int customerId, String customerName, int mobile) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}
	public Registration() {
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
	
}
