package com.capgemini.person.service;

import com.capgemini.person.entity.Person;

public interface PersonService {
	
	public void addNewPersonToDatabase(Person person);
	
	public Person showPersonById(int Id);

}
