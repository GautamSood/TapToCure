package com.fil.springrestexample.service;

import java.util.List;

import com.fil.springrestexample.entities.Trainee;

public interface TraineeService {

	public List<Trainee> getAllTrainee();
	public Trainee getTraineeById(long traineeId);
	public List<Trainee> getTraineeByName(String traineeName);
	public Trainee addTrainee(Trainee trainee);
	public Trainee updateTrainee(Trainee trainee);
	public void deleteTrainee(long taineeId) throws Exception;
	
}
