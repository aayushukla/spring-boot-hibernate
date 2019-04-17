package com.capgemini.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.person.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO dao;
	
	@Override
	public void addNewPersonToDatabase(Person person) {
	dao.save(person);	
	}

	@Override
	public Person showPersonById(int id) {
		return (dao.findById(id).get());
	}
	
	@Override
	public void oneToManyAddition(List<Person> person) {
	dao.saveAll(person);	
	}
	
	@Override
	public Person showOneToMany(int id) {
		return (dao.findAll().get(id));
	}

}
