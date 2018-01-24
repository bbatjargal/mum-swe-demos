package mum.swe.demosecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.demosecurity.model.Course;
import mum.swe.demosecurity.repository.CourseRepository;
import mum.swe.demosecurity.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course findOne(Long id) {
		return courseRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		courseRepository.delete(id);
	}

}
