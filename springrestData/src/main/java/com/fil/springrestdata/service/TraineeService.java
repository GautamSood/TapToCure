package com.fil.springrestdata.service;

import java.util.List;

import com.fil.springrestdata.Entity.Trainee;

public interface TraineeService {
	
	public List<Trainee> getTrainees();
	public List<Trainee> getTrainees(String traineeDomain);
	public Trainee getTrainees(long traineeId);
	public Trainee addTrainee(Trainee trainee);
	public Trainee updateTrainee(Trainee trainee);
	public void deleteTrainee(long traineeId) throws Exception;
	

}
