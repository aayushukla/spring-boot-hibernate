package com.capgemini.person.service;

import java.util.List;

import com.capgemini.person.entity.Person;

public interface PersonService {
	
	public void addNewPersonToDatabase(Person person);
	
	public Person showPersonById(int Id);
	
	public void oneToManyAddition(List<Person> person);
	
	public Person showOneToMany(int id);

}
