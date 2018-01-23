package mum.swe.demosecurity.service;

import java.util.List;

import mum.swe.demosecurity.model.Student;

public interface StudentService {
	 List<Student> findAll();
	 Student save(Student student);
	 Student findOne(Long id);
	 void delete(Long id);
}
