package com.javaProgram.person.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaProgram.person.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {

}
