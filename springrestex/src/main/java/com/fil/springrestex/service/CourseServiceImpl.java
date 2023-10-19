package com.fil.springrestex.service;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fil.springrestex.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "Java Course", "this course contains basics of Java"));
		list.add(new Course(146, "Hibernate Course", "this course will teach you complete knowledge"));
		list.add(new Course(147, "JavaScript Course", "this course contains basics of Java"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourses(long courseId) {
		Course c = null;
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long courseId) throws Exception {
//		list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		
		if (!list.removeIf(courses -> courses.getId() == courseId)) throw new Exception("Not Found");
	}

}
