package com.capgemini.person.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.person.entity.Person;
import com.capgemini.person.entity.PersonCertifications;
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
		
	    List<PersonCertifications> certifications= new ArrayList<>();
		PersonCertifications person1=new PersonCertifications(102,"java");
		PersonCertifications person2=new PersonCertifications(103,"python");
		PersonCertifications person3=new PersonCertifications(104,".net");
		PersonCertifications person4=new PersonCertifications(105,"swift");
		certifications.add(person1);
		certifications.add(person2);
		certifications.add(person3);
		certifications.add(person4);
		
		Person c= new Person(2000,"Java",certifications);
		return c;
	}
}
