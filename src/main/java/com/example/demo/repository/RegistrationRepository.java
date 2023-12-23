package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Registration;



@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long>{
	 Optional<Registration> findByEmail(String email);
	 Optional<Registration> findByEmailAndPassword(String email, String password);

	public void save(Optional<Registration> loginOptional);
	
	
}
