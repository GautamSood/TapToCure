package com.fil.springrestdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fil.springrestdata.Entity.Trainee;
import com.fil.springrestdata.service.TraineeService;

@RestController
@RequestMapping("/api/v1.0/")
public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/trainee")
	public List<Trainee> getTrainees(){
		return this.traineeService.getTrainees();
	}
	
	@GetMapping("/traineeByName/{traineeDomain}")
	public List<Trainee> getTrainees(@PathVariable String traineeDomain){
		return this.traineeService.getTrainees(traineeDomain);
	}
	
	@GetMapping("/trainee/{traineeId}")
	public Trainee getTrainees(@PathVariable long traineeId) {
		return this.traineeService.getTrainees(traineeId);
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
			this.traineeService.deleteTrainee( Long.parseLong(traineeId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
