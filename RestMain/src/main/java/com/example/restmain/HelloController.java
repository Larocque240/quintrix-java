package com.example.restmain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.restmain.Users;

@RestController
public class HelloController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get")
	public String getuser() {
		
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/getusers", String.class);
		return response.getBody();
	}
		
	@PostMapping
	public String postuser(@RequestBody Users User) {
		HttpEntity<Users> response = new HttpEntity<>(User);
		return restTemplate.postForObject("http://localhost:8080/user", response, String.class);
	}
	
}
