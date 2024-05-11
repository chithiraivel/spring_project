package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.repository.JPARepo;

/*
@Service
public class StudentService {
	
	@Autowired
	JPARepo jpa;

	public Registration addData(Registration regi) {
		return this.jpa.save(regi);
		
	}
	
	public List<Registration> getAllRecords(){
		return this.jpa.findAll();
		
	}
	
	public Optional<Registration> getRecord(Integer id) {
		return this.jpa.findById(id);
	}
	
	public Registration updateRecord(Integer id ,Registration regi) {
		Registration oldRecords=this.jpa.findById(id).orElseThrow();
		oldRecords.setName(regi.getName());
		oldRecords.setName(regi.getAddress());
		return this.jpa.save(oldRecords);
	}
}
*/


@Service
public class StudentService {
	
	@Autowired
	JPARepo jpa;
	
	public Registration addData(Registration registration) {
		return this.jpa.save(registration);
		
	}
	
	public Registration updateData(Integer customerId ,Registration registration) {
		Registration oldRecords=this.jpa.findById(customerId).orElseThrow();
		oldRecords.setCustomerName(registration.getCustomerName());
		oldRecords.setMobile(registration.getMobile());
		return this.jpa.save(oldRecords);
	}
	
	public List<Registration> listAllCustomer(){
		return this.jpa.findAll();
		
	}
	
	public Optional<Registration> getParticularRecord(Integer customerId) {
		return this.jpa.findById(customerId);
	}
	
	public String deleteRecords(Integer customerId) {
		this.jpa.deleteById(customerId);
		return "Successfully deleted";
	}
}
