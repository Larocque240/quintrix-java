package com.quintrix.java.userdb.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.PreparedStatementSetter;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.quintrix.java.userdb.model.Users;
import com.quintrix.java.userdb.service.ServiceLayer;
import com.quintrix.java.userdb.model.*;


@RestController
public class UserController {
	
	
	
	
	Users gpm = new Users();
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	ServiceLayer serviceLayer; 
	
	@RequestMapping(method = RequestMethod.GET, value =  "/users")
	public List<Users> getAll_Users(){
		
		String getmyusers = "SELECT stuId, fname, lname\r\n"+ "FROM `uhcldb`.`student`";
				
		return serviceLayer.getAllUsers();
	}

	
	@GetMapping("/get")
	public Users GetModel(@RequestParam String fname, @RequestParam String lname) {
	 
		//Users gpm = new Users();//get post model 2
		gpm.setFirstName(fname);
		gpm.setLastName(lname);
		
		return  gpm;
	}
	
	@PostMapping("/post")
	public Users GetPost(@RequestBody Users myInput) {
		//get post model (1)
		gpm.setFirstName(myInput.getFirstName()  + " <-- This is the response");
		gpm.setLastName(myInput.getLastName() + " <-- This is the response");
		return gpm;
	}
	
	
	
	@PutMapping("/put")
	public Users GetPut() {

		gpm.setFirstName("rarr");
	    gpm.getFirstName();
	
	    
		return gpm;
	}
	
	
	@DeleteMapping("/delete")
	public void deleteUser(){
		gpm.setFirstName(null);
		gpm.setLastName(null);
	}
	
	
    	
	
		
	
}
