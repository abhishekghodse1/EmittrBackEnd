package com.example.demo.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.model.Registration;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.RegistrationRepository;
import com.example.demo.service.LoginServ;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("first")
public class RegistrationController {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private LoginRepository loginrepo;
	
	@Autowired
	private LoginServ loginserv;
	
	@PostMapping("/registration")
	public Registration addStudent(@RequestBody Registration registration )
	{
	
	
		
		registration.setRoleId(2);

		return registrationRepository.save(registration);
	}
	 
	 @PostMapping("/login")
	    public ResponseEntity<Registration> loginUser(@RequestBody Registration registration) {
	        String email = registration.getEmail();
	        String password = registration.getPassword();

	        Optional<Registration> registrationOptional = registrationRepository.findByEmailAndPassword(email, password);
	        loginserv.saveData(email, password);
	        return registrationOptional.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
	    }
	}


	




