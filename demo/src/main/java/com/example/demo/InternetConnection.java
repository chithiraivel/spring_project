package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	private String owner;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	private int doorNo;
	
	public void switchOn() {
		System.out.println("Switching on.");
	}
	
}
