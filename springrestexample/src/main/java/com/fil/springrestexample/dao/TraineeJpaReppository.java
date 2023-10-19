package com.fil.springrestexample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.springrestexample.entities.Trainee;

@Repository
public interface TraineeJpaReppository extends JpaRepository<Trainee, Long> {

	List<Trainee> findBytraineeName(String traineeName);

	

}
