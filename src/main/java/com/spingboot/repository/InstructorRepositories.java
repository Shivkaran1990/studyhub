package com.spingboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.spingboot.model.Webinar;

public interface InstructorRepositories  extends CrudRepository<Webinar, String>{

}
