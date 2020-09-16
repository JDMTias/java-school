package com.lambdaschool.javaschool2.repositories;

import com.lambdaschool.javaschool2.models.Instructor;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD repository connecting Instructors to the rest of the application
 */
public interface InstructorRepository
        extends CrudRepository<Instructor, Long>
{

}

