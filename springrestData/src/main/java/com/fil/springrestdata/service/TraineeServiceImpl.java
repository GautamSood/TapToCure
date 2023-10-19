package com.fil.springrestdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.springrestdata.Entity.Trainee;
import com.fil.springrestdata.Repository.TraineeJpaRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeJpaRepository traineeJpaRepository;

	@Override
	public List<Trainee> getTrainees() {
		// TODO Auto-generated method stub
		return traineeJpaRepository.findAll();
	}

	@Override
	public List<Trainee> getTrainees(String traineeDomain) {
		// TODO Auto-generated method stub
		 return traineeJpaRepository.findByDomain(traineeDomain);
	}

	@Override
	public Trainee getTrainees(long traineeId) {
		// TODO Auto-generated method stub
		return traineeJpaRepository.findById(traineeId).get();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		traineeJpaRepository.save(trainee);
		return trainee;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		traineeJpaRepository.save(trainee);
		return trainee;
	}

	@Override
	public void deleteTrainee(long traineeId) throws Exception {
		// TODO Auto-generated method stu0b
		traineeJpaRepository.deleteById(traineeId);
		
	}

}
