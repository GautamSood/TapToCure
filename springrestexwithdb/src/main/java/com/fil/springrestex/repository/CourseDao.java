package com.fil.springrestex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fil.springrestex.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>{
	
}
