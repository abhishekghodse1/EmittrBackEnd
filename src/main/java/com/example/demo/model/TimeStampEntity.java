package com.example.demo.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="timestamp")
public class TimeStampEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TIMESTAMP")
    private LocalDateTime timestamp;

    @Column(name = "SCORE")
    private int score;
    
    @Column(name = "username")
    private String username;

	public TimeStampEntity() {
		super();
	}

	

	public TimeStampEntity(int id, LocalDateTime timestamp, int score, String username) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.score = score;
		this.username = username;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
