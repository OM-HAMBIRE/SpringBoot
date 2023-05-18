package com.javaProgram.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaProgram.person.Dao.PersonDao;
import com.javaProgram.person.model.Person;


@Service
public class PersonService {

	
	@Autowired
	PersonDao personDao;
	
	//create multiple
	public Iterable<Person> create(Iterable <Person> PersonId)
	{
		
		return personDao.saveAll(PersonId);
	}
	
	
	//find all
	
	
	public Iterable<Person> getAllTickets()
	
	{
		return personDao.findAll();
	}
	//find multiple by id
	
	public Iterable<Person> getDataById(Iterable<Integer> PersonId)
	{
		
		
		return personDao.findAllById(PersonId);
	}
}
