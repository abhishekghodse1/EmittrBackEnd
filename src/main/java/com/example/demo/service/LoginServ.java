package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.model.Registration;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.RegistrationRepository;

import jakarta.transaction.Transactional;

import java.util.Optional;

@Service
public class LoginServ {
//
//	
	@Autowired
	private LoginRepository loginrepo;

	@Autowired
	private RegistrationRepository RegistrationRepository;

	public void saveData(String email, String password) {
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		loginrepo.save(login);
	}

	public Optional<Registration> loginUser(String email, String password) {
		Optional<Registration> loginOptional = RegistrationRepository.findByEmailAndPassword(email, password);

		if (loginOptional.isPresent()) {
			Optional<Registration> registrationOptional = RegistrationRepository.findByEmail(email);

			System.out.println(email);
			Login login = new Login();
			login.setEmail(email);
			login.setPassword(password);
			loginrepo.save(login);
			return registrationOptional;
		}

		return Optional.empty();
	}

}