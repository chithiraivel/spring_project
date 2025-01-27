package com.MrBoo.TestModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="tasks")
public class TestModels {
	
	@Id
	@Column(name="id",length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public TestModels() {
		
	}
	public TestModels(int id, String name, String mobile, String address, String profile) {
	
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.profile = profile;
	}
	private String name;
	private String mobile;
	private String address;
	private String profile;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddres(String address) {
		this.address = address;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

	
	
	
}
