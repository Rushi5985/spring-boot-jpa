package com.rushi.examples.jpa.repository;

import com.rushi.examples.jpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
