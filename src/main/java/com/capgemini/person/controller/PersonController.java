package com.capgemini.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.person.entity.Person;
import com.capgemini.person.entity.PersonCertifications;
import com.capgemini.person.entity.PersonalData;
import com.capgemini.person.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@RequestMapping("/")
	public Person addPerson() {
		Person person = new Person(101,"Moriarty",new PersonalData(1,"b-",184,70));
		service.addNewPersonToDatabase(person);
		return person;
	}
	@RequestMapping("/show")
	public Person showPerson() { 
		return service.showPersonById(101);
	}
	
	@RequestMapping("/certification")
	public Person cerficationPerson() { 
		PersonCertifications c= new PersonCertifications(2000,"Java",);
	}
}
