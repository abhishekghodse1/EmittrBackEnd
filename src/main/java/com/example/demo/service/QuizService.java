package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Questions;
import com.example.demo.repository.QuizRepo;

@Service
public class QuizService {

	@Autowired
	private QuizRepo quizRepo;

	public List<Questions> getAllQuiz(String qLanguage, String question, String option1, String option2, String option3,
			String option4, String answer, String difficultyLevel, String questionMarks) {
//        return quizRepo.findAll();

		Questions ques = new Questions();

		ques.setAnswer(answer);
		ques.setDifficultyLevel(difficultyLevel);
		ques.setOption1(option1);
		ques.setOption2(option2);
		ques.setOption3(option3);
		ques.setOption4(option4);
		ques.setQLanguage(qLanguage);
		ques.setQuestion(questionMarks);

		return (List<Questions>) quizRepo.save(ques);
	}

	public Questions saveAnswer(Questions Questions) {
		return quizRepo.save(Questions);
	}
}
