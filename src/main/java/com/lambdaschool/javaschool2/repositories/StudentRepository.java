package com.lambdaschool.javaschool2.repositories;


import com.lambdaschool.javaschool2.models.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD repository connecting  to the rest of the application
 */
public interface StudentRepository
        extends CrudRepository<Student, Long>{
}

