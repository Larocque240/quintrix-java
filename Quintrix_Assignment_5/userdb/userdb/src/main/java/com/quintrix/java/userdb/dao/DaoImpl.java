package com.quintrix.java.userdb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.quintrix.java.userdb.model.Users;

@Component
public class DaoImpl implements Dao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Users> getUsers() {
		String getmyusers = "SELECT stuId, fname, lname\r\n"+ "FROM `uhcldb`.`student`";
		return jdbcTemplate.query(getmyusers, new BeanPropertyRowMapper<Users>(Users.class));
	}



}
