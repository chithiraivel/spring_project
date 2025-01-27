package com.MrBoo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.MrBoo.TestModel.TestModels;
import com.MrBoo.repository.TestRepository;





@Service
public class TestService {
	
	@Autowired
	TestRepository jpa;
	
	public TestModels addData(TestModels test) {
		return this.jpa.save(test);
		
	}
	
	public TestModels updateData(Integer id ,TestModels test) {
		TestModels oldRecords=this.jpa.findById(id).orElseThrow();
		oldRecords.setName(test.getName());
		oldRecords.setMobile(test.getMobile());
		oldRecords.setAddres(test.getAddress());
		oldRecords.setProfile(test.getProfile());
		return this.jpa.save(oldRecords);
	}

	public List<TestModels> listAllCustomer(){
		return this.jpa.findAll();
		
	}
	
	public Optional<TestModels> getParticularRecord(Integer id) {
		return this.jpa.findById(id);
	}
	
	public String deleteRecords(Integer id) {
		this.jpa.deleteById(id);
		return "Successfully deleted";
	}
}
