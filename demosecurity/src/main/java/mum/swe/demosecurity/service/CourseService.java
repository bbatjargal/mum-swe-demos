package mum.swe.demosecurity.service;

import java.util.List;

import mum.swe.demosecurity.model.Course;

public interface CourseService {
	 List<Course> findAll();
	 Course save(Course course);
	 Course findOne(Long id);
	 void delete(Long id);
}
