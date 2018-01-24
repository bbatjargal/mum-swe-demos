package mum.swe.demosecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.demosecurity.model.Faculty;
import mum.swe.demosecurity.repository.FacultyRepository;
import mum.swe.demosecurity.service.FacultyService;

@Service("facultyService")
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	FacultyRepository facultyRepository;
	
	@Override
	public List<Faculty> findAll() {
		return facultyRepository.findAll();
	}

	@Override
	public Faculty save(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty findOne(Long id) {
		return facultyRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		facultyRepository.delete(id);
	}

}
