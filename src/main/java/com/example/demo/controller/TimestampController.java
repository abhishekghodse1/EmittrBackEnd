package com.example.demo.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Registration;
import com.example.demo.model.TimeStampEntity;
import com.example.demo.repository.RegistrationRepository;
import com.example.demo.repository.TimestampRepository;
import com.example.demo.service.TimestampServ;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/timestamp")

//http://localhost:8080/timestamp/store
public class TimestampController {
	@Autowired
    private TimestampRepository timestampRepository;
	
	@Autowired
	private RegistrationRepository regisrepo;
	
	@Autowired
	private TimestampServ timeserv;

	@GetMapping("/getTimestamps")
    public ResponseEntity<List<TimeStampEntity>> getTimestamps() {
        try {
            // Fetch all timestamps from the repository
            List<TimeStampEntity> timestamps = timestampRepository.findAll();

            return new ResponseEntity<>(timestamps, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/all")
//    public List<TimeStampEntity> getAllTimestamps() {
//        return timestampRepository.findAll();
//    }
    
	@RequestMapping("/store")
    public ResponseEntity<String> storeTimestamp(@RequestBody TimeStampEntity timestampEntity) {
        try {
        	System.out.println("dghjk");
//             Set the timestamp using LocalDateTime
            timestampEntity.setTimestamp(LocalDateTime.now());
            Object name = regisrepo.findByEmail(timestampEntity.getUsername());
            // Get the score and username from the request body or any other source
            int score = timestampEntity.getScore();
            String username = timestampEntity.getUsername();
            
            // Save timestamp, score, and username
            
            timestampRepository.save(timestampEntity);

            return new ResponseEntity<>("Timestamp, score, and username stored successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error storing timestamp, score, and username.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

}
