package com.fil.springrestexample.service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.springrestexample.dao.TraineeJpaReppository;
import com.fil.springrestexample.entities.Trainee;



@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeJpaReppository traineeJpaReppository;
	

	@Override
	public List<Trainee> getAllTrainee() {
		return traineeJpaReppository.findAll();
	}

	@Override
	public Trainee getTraineeById(long traineeId) {
		return traineeJpaReppository.findById(traineeId).get();
		
	}

	@Override
	public List<Trainee> getTraineeByName(String traineeName) {
			return traineeJpaReppository.findBytraineeName(traineeName);
		
		
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		traineeJpaReppository.save(trainee);
		return trainee;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		traineeJpaReppository.save(trainee);
		return trainee;
	}

	@Override
	public void deleteTrainee(long taineeId) throws Exception {
		traineeJpaReppository.deleteById(taineeId);
		
	}
}

	
