package com.fil.springrestex.service;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fil.springrestex.entities.Course;
import com.fil.springrestex.repository.CourseDao;

@Service
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	private CourseDao courseDao;
	

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(long courseId) {
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;

	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) throws Exception {
		courseDao.deleteById(courseId);
	}

	@Override
	public Course completeUpdate(Course course) {
		return courseDao.save(course);
	}

}
