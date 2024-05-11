package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {

	public Home() {
		System.out.println("home constructor");
	}
	private String Name;
	private int DoorNo;
	@Autowired
	private InternetConnection modem;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(int doorNo) {
		DoorNo = doorNo;
	}
	
	public void connect() {
		modem.switchOn();
		
		System.out.println("Connecting........");
	}
	
}
