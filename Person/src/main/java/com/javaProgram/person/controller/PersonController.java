package com.javaProgram.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaProgram.person.model.Person;
import com.javaProgram.person.service.PersonService;


@RestController
@RequestMapping(value="/person")

public class PersonController {

	
	@Autowired
	PersonService personService;
	
	/*/
	 * [
    {
      "firstName":"om",
      "lastName":"hambire",
      "age":20,
      "createdDate": "2023-05-17T21:05:55.741+00:00"
      
   },
   {
      "firstName":"gana",
      "lastName":"dhotre",
      "age":25,
      "createdDate": "2023-05-17T21:05:55.741+00:00"
      
   }
]
	 */
	//create multiple records
	//http://localhost:8080/person/createall
	@PostMapping(value="/createall")
	public Iterable <Person> create(@RequestBody Iterable <Person> PersonId)
	{
		return personService.create(PersonId);	
	}
	
	
	
	//Retrieve all records by id
	//http://localhost:8080/person/getall
	@GetMapping(value="/getall")
	public Iterable <Person> getAllTickets()
	{
		return personService.getAllTickets();
		
		
	}
	
	//Retrieve multiple records by id   
	// "this part of code is not running"
	//http://localhost:8080/person/getall/1,2 
	
		@GetMapping(value="/getall/{PersonId}")
		public Iterable<Person> getData(@PathVariable("PersonId") Iterable <Integer> PersonId)
		{
			return this.personService.getDataById(PersonId);
		}
	

	
}
