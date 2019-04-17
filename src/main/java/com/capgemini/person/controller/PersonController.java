package com.capgemini.person.controller;

import java.util.ArrayList;
import java.util.List;

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
	public PersonCertifications cerficationPerson() {
		
	    List<Person> person= new ArrayList<>();
		Person person1=new Person(102,"Mrunal",new PersonalData(2,"b+",280,50));
		Person person2=new Person(103,"shinchan",new PersonalData(3,"a+",380,230));
		Person person3=new Person(104,"donald",new PersonalData(4,"ab+",230,80));
		Person person4=new Person(105,"mango",new PersonalData(5,"o",160,60));
		person.add(person1);
		person.add(person2);
		person.add(person3);
		person.add(person4);
		
		PersonCertifications c= new PersonCertifications(2000,"Java",person);
		return c;
	}
}
