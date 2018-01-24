package mum.swe.demosecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.swe.demosecurity.model.Faculty;

@Repository("facultyRepository")
public interface FacultyRepository extends JpaRepository<Faculty, Long>{
}