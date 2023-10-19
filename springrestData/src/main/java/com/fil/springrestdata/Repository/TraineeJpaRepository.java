package com.fil.springrestdata.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.springrestdata.Entity.Trainee;

@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee, Long> {


//	public List<Trainee> findByName(String traineeName);

	public List<Trainee> findByDomain(String traineeDomain);

	 



}
