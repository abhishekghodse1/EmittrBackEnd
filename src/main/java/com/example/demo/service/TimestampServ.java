package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepository;
import com.example.demo.repository.TimestampRepository;

@Service
public class TimestampServ {

	@Autowired
	private RegistrationRepository timerepo;
	public void saveData(String username) {
		Registration res = new Registration();
		res.setFirstName(username);
		timerepo.save(res);
		
	}
}
