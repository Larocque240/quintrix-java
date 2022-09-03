package com.quintrix.java.userdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.quintrix.java.userdb.model.Users;

@Service
public class ServiceImpl implements ServiceLayer{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Users> getAllUsers() {
		String getmyusers = "SELECT stuId, fname, lname\r\n"+ "FROM `uhcldb`.`student`";
		return jdbcTemplate.query(getmyusers, new BeanPropertyRowMapper<Users>(Users.class));
	}
	
}
