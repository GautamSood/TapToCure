package com.fil.springrestex.service;

import java.util.List;

import com.fil.springrestex.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourses(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long courseId) throws Exception;
	public Course completeUpdate(Course course);
	
}
