package com.example.Quintrix_Assignment_4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Quintrix_Assignment_4.controller.model.GetPostModel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class GetPostController {

	@GetMapping("/get")
	public GetPostModel GetModel(@RequestParam String fname, @RequestParam String lname) {
	 
		GetPostModel gpm2 = new GetPostModel();
		gpm2.setFirstName(fname);
		gpm2.setLastName(lname);
		
		return  gpm2;
	}
	
	@PostMapping("/post")
	public GetPostModel GetPost(@RequestBody GetPostModel myInput) {
		GetPostModel gpm = new GetPostModel();
		gpm.setFirstName(myInput.getFirstName()  + " <-- This is the response");
		gpm.setLastName(myInput.getLastName() + " <-- This is the response");
		return gpm;
	}
	
	@PostMapping("path = /response")
	@ResponseBody
    public GetPostModel postResponse(@RequestBody TextTransfer mytext)
       {
        return new GetPostModel();
       }
}
