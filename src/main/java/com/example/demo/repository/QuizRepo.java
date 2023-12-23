package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Questions;


@Repository
public interface QuizRepo extends JpaRepository<Questions, Integer>{

}
