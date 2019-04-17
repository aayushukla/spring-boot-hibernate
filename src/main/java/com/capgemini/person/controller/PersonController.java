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
		Person person = new Person(101, "Moriarty", new PersonalData(1, "b-", 184, 70));
		service.addNewPersonToDatabase(person);
		return person;
	}

	@RequestMapping("/show")
	public Person showPerson() {
		return service.showPersonById(101);
	}

	@RequestMapping("/certification")
	public List<Person> personList() {

		List<Person> personList = new ArrayList<Person>();

		//Available Certifications
		PersonCertifications certification1 = new PersonCertifications(102, "java");
		PersonCertifications certification2 = new PersonCertifications(103, "python");
		PersonCertifications certification3 = new PersonCertifications(104, ".net");
		PersonCertifications certification4 = new PersonCertifications(105, "swift");

		//Certifications taken by sophie
		List<PersonCertifications> certifications = new ArrayList<>();
		certifications.add(certification1);
		certifications.add(certification2);

		//Certifications taken by rose
		List<PersonCertifications> certifications2 = new ArrayList<>();
		certifications2.add(certification4);
		certifications2.add(certification3);

		//Creating objects
		Person p1 = new Person(101, "SophieTurner", certifications);
		Person p2 = new Person(102, "Rose", certifications);

		//Adding data for sophie and rose in a list
		personList.add(p1);
		personList.add(p2);

		//Saving the list in h2 database
		service.oneToManyAddition(personList);
		return personList;
	}
	
	@RequestMapping("/certificateshow")
	public Person showPersonCertificates() {
		return service.showOneToMany(1);
	}
}
