package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "questionbank")
public class Questions {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Qid")
	    private Integer qid;

	    @Column(name = "QLanguage")
	    private String qLanguage;

	    @Column(name = "Question")
	    private String question;

	    @Column(name = "Option1")
	    private String option1;

	    @Column(name = "Option2")
	    private String option2;

	    @Column(name = "Option3")
	    private String option3;

	    @Column(name = "Option4")
	    private String option4;

	    @Column(name = "Answer")
	    private String answer;

	    @Column(name = "Difficulty_level")
	    private String difficultyLevel;

	    @Column(name = "Question_marks")
	    private String questionMarks;
	    
	    private Integer correct_option;

	    // Constructors

	    public Questions() {
	        // Default constructor
	    }

	    public Questions(String qLanguage, String question, String option1, String option2, String option3,
	                        String option4, String answer, String difficultyLevel, String questionMarks,Integer correct_option) {
	        this.qLanguage = qLanguage;
	        this.question = question;
	        this.option1 = option1;
	        this.option2 = option2;
	        this.option3 = option3;
	        this.option4 = option4;
	        this.answer = answer;
	        this.difficultyLevel = difficultyLevel;
	        this.questionMarks = questionMarks;
	        this.correct_option=correct_option;
	    }

	    // Getters and setters

	    public Integer getQid() {
	        return qid;
	    }

	    public Integer getCorrect_option() {
			return correct_option;
		}

		public void setCorrect_option(Integer correct_option) {
			this.correct_option = correct_option;
		}

		public void setQid(Integer qid) {
	        this.qid = qid;
	    }

	    public String getQLanguage() {
	        return qLanguage;
	    }

	    public void setQLanguage(String qLanguage) {
	        this.qLanguage = qLanguage;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public void setQuestion(String question) {
	        this.question = question;
	    }

	    public String getOption1() {
	        return option1;
	    }

	    public void setOption1(String option1) {
	        this.option1 = option1;
	    }

	    public String getOption2() {
	        return option2;
	    }

	    public void setOption2(String option2) {
	        this.option2 = option2;
	    }

	    public String getOption3() {
	        return option3;
	    }

	    public void setOption3(String option3) {
	        this.option3 = option3;
	    }

	    public String getOption4() {
	        return option4;
	    }

	    public void setOption4(String option4) {
	        this.option4 = option4;
	    }

	    public String getAnswer() {
	        return answer;
	    }

	    public void setAnswer(String answer) {
	        this.answer = answer;
	    }

	    public String getDifficultyLevel() {
	        return difficultyLevel;
	    }

	    public void setDifficultyLevel(String difficultyLevel) {
	        this.difficultyLevel = difficultyLevel;
	    }

		public String getqLanguage() {
			return qLanguage;
		}

		public void setqLanguage(String qLanguage) {
			this.qLanguage = qLanguage;
		}

		public String getQuestionMarks() {
			return questionMarks;
		}

		public void setQuestionMarks(String questionMarks) {
			this.questionMarks = questionMarks;
		}
}
