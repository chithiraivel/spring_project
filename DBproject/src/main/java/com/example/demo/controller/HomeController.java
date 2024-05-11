package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Registration;
import com.example.demo.service.StudentService;

/*@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/getInfo")
	public String getUserInfo() {
		return "Hii welcome";
	}
	
	@GetMapping("/getUser/{name}")
	public String getUserName(@PathVariable (value ="name") String n) {
		
		return "hii" + n;
	}
	
	@Autowired
	StudentService student;
	
	@PostMapping("/regi")
	public Registration addValue (@RequestBody Registration regi) {
		return this.student.addData(regi);
		
	}
	
	@GetMapping("/getRecords")
	public List<Registration>  getData() {
		return this.student.getAllRecords();
	}
	
	@GetMapping("/getParticularRecord/{id}")
	public Optional<Registration>  getRecord(@PathVariable (value="id") Integer id) {
		return this.student.getRecord(id);
		
	}
	
	@PutMapping("/updateRec/{id}")
	public Registration updateRec(@PathVariable (value="id") Integer id,@RequestBody Registration regi) {
		return this.student.updateRecord(id, regi);
}
	
}*/


@RestController  //api work annotation
@CrossOrigin(origins = "*")	 //react to spring connect
@RequestMapping("/api/customer")   
public class HomeController {
	@Autowired
	StudentService student;
	
	//create customer
	@PostMapping(path="/addCustomer")
	public Registration addCustomer(@RequestBody Registration registration) {
		return this.student.addData(registration);
		
	}
	
	//update customer
	@CrossOrigin(origins = "*")
	@PutMapping("/updateCustomer/{customerId}")
	public Registration updateCustomer(@PathVariable (value="customerId") Integer customerId,@RequestBody Registration registration) {
		return this.student.updateData(customerId, registration);
}
	
	//list all customer data
	@GetMapping("/listAllCustomer")
	public List<Registration>  getData() {
		return this.student.listAllCustomer();
	}
	
	//get particular data
	@GetMapping("/getParticularRecord/{customerId}")
	public Optional<Registration>  getRecord(@PathVariable (value="customerId") Integer customerId) {
		return this.student.getParticularRecord(customerId);
		
	}
	
	//delete records
	@DeleteMapping("/deleteRecord/{customerId}")
	public String DeleteRecords(@PathVariable (value="customerId") Integer customerId) {
		return this.student.deleteRecords(customerId);
	}
}

