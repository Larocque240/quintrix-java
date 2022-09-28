package com.quintrix.assignments.Quintrix_Assignment_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App 
{
	
		
    public static void main( String[] args )
    {
    	App run = new App();
        run.Build_a_hashMap();
        run.BuildList();
        run.BuildSet();
        run.BuildFile();
        run.BuildRegex();
        run.toString();
        
    }
	
	 
    
    
    public void Build_a_hashMap() 
    {
    	
    	
    	HashMap <Integer, String> map = new HashMap<>();
    	map.put(1, "red");
    	map.put(2, "blue");
    	map.put(3, "green");
    	
    	System.out.println("Map\n");
    	
    	for (Integer i : map.keySet()) {
    		  System.out.println("key: " + i + " value: " + map.get(i));
    		}
    	
    }
    
    public void BuildList() {
    	
    	List<Integer> list=new ArrayList<Integer>();
    	list.add(13);
    	list.add(3);
    	list.add(4);
    	System.out.println("\nList");
    	for (Integer i : list) {
    		System.out.println(i);
    		
    	}
    	
    }
    public void BuildSet() {
    	
    	System.out.println("\nSet");
    	Set<Integer> set = new HashSet<Integer>();
    	set.add(45);
    	set.add(1);
    	set.add(23);
    	for(Integer i : set) {
    		System.out.println(i);
    	}
    	
    }
    
    public void BuildFile() {
    
    	try {
    	      FileWriter writer = new FileWriter("Input.txt");
    	      writer.write("This is a test of the file writer");
    	      writer.close();
    	      System.out.println("\nSuccessfully wrote to the file and closed.");
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    }
    
    public void BuildRegex() {
    	String badEmail = "iwireobjects@gmail.com";
    	String validEmail = "iwireobjects#gmail.com";
    	List<String> email = new ArrayList<String>();
    	email.add(badEmail);
    	email.add(validEmail);
    	
    	Pattern pattern = Pattern.compile("^(.+)@(.+)$");
    	for(String e : email) {
    		Matcher matcher = pattern.matcher(e);
    		 
    		  if(matcher.matches() == true) 
  	    	{
  	    	  System.out.println("\n"+ e +" : "+ "Valid!");
  	   	  	}
  	    	
  	    	if(matcher.matches() == false) {
  	    		System.out.println("\n" + e + "  : " + "Invalid!");
  	    	}
      	
    	}
    	
    }




	@Override
	public String toString() {
		return "App [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}




  


    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
