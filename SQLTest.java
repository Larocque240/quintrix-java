package com.quintrix.assignments.Quintrix_Assignment_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLTest 
{
    public static void main( String[] args )
    {
    	try {
    		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","kubibl");
    		
    		Statement statement = connection.createStatement();
    		
    		ResultSet resultSet = statement.executeQuery("SELECT deptno, empID\r\n"
    				+ "FROM employee\r\n"
    				+ "INNER JOIN department\r\n"
    				+ "ON employee.empID = department.deptno;");
    		
    		
    		while (resultSet.next()) {
    				System.out.println(resultSet.getString("name"));
    		}
    		
    		
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}

    	
    	
    
    
    
    
    
    
    
    
    
    }
}
