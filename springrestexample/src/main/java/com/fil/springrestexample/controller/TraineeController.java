package com.fil.springrestexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fil.springrestexample.entities.Trainee;
import com.fil.springrestexample.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/trainee")
	public List<Trainee> getAllTrainee(){  
		return this.traineeService.getAllTrainee(); 
	}
	@GetMapping("/trainee/{traineeId}")
	public Trainee getTraineeById(@PathVariable long traineeId) {
		return this.traineeService.getTraineeById(traineeId);
	}
	
	@GetMapping("/traineeName/{traineeName}")
	public List<Trainee> getTraineeByName(@PathVariable String traineeName) {
		return this.traineeService.getTraineeByName(traineeName);
	}
	
	@PostMapping("/trainee")
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return this.traineeService.addTrainee(trainee);
		}
	
	@PutMapping("/trainee")
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		return this.traineeService.updateTrainee(trainee);
		}

	@DeleteMapping("/trainee/{traineeId}")
	public ResponseEntity<HttpStatus> deleteTrainee(@PathVariable String traineeId) {
		try {
			this.traineeService.deleteTrainee(Long.parseLong(traineeId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
}
