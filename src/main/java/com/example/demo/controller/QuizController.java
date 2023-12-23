package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Questions;
import com.example.demo.repository.QuizRepo;
import com.example.demo.service.QuizService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
    private QuizRepo quizRepo;
	
	
	
//	@Autowired
//    private QuizService quizService;

   
//	@GetMapping("/questions")
//	public ResponseEntity<List<Questions>> getAllQuestions() {
//	    List<Questions> questions = ((ListCrudRepository<Questions, Integer>) quizRepo).findAll();
//	    
//	    if (questions.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 No Content if the list is empty
//	    } else {
//	        return new ResponseEntity<>(questions, HttpStatus.INTERNAL_SERVER_ERROR); // Return the list if it's not empty
//	    }
//	}
	
	
	@GetMapping("/getstud")
	public List<Questions> getAllStudent()
	{
		return ((ListCrudRepository<Questions, Integer>) quizRepo).findAll();
		
	}

    @PostMapping("/saveQuestions")
    public ResponseEntity<Questions> saveAnswer(@RequestBody Questions Questions) {
    	Questions savedAnswer = quizRepo.save(Questions);
        return new ResponseEntity<>(savedAnswer, HttpStatus.CREATED);
    }
    
//    @PostMapping("/add")
//    public void addQuestion(@RequestBody Questions question) {
//        quizService.addQuestion(question);
//    }
}



