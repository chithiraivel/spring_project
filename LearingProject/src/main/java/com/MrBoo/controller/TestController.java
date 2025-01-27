package com.MrBoo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MrBoo.TestModel.TestModels;
import com.MrBoo.repository.TestRepository;
import com.MrBoo.service.TestService;






@RestController  //api work annotation
@CrossOrigin(origins = "*")	 //angular to spring connect
@RequestMapping("/api/customer")   
public class TestController {

	@Autowired
	TestService service;
	
	//create customer
		@PostMapping(path="/addCustomer")
		public TestModels addCustomer(@RequestBody TestModels test) {
			return this.service.addData(test);
			
		}
		
		//update customer
		@CrossOrigin(origins = "*")
		@PutMapping("/updateCustomer/{id}")
		public TestModels updateCustomer(@PathVariable (value="id") Integer id,@RequestBody TestModels test) {
			return this.service.updateData(id, test);
	}
		
		//list all customer data
		@GetMapping("/listAllCustomer")
		public List<TestModels>  getData() {
			return this.service.listAllCustomer();
		}
		
		//get particular data
		@GetMapping("/getParticularRecord/{id}")
		public Optional<TestModels>  getRecord(@PathVariable (value="id") Integer id) {
			return this.service.getParticularRecord(id);
			
		}
		
		//delete records
		@DeleteMapping("/deleteRecord/{id}")
		public String DeleteRecords(@PathVariable (value="id") Integer id) {
			return this.service.deleteRecords(id);
		}
}


