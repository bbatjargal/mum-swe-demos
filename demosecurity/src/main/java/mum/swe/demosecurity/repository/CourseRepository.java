package mum.swe.demosecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.swe.demosecurity.model.Course;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Long>{
}