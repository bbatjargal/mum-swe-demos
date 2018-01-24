package mum.swe.demosecurity.service;

import java.util.List;

import mum.swe.demosecurity.model.Faculty;

public interface FacultyService {
	 List<Faculty> findAll();
	 Faculty save(Faculty faculty);
	 Faculty findOne(Long id);
	 void delete(Long id);
}
