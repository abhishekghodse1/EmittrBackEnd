package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;
import com.example.demo.model.Registration;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

//	 Optional<Login> findByEmailAndPassword(String email, String password);

//		public void save(Optional<Login> loginOptional);

	Optional<Login> findByEmail(String email);

}
