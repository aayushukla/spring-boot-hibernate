package com.capgemini.person.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.person.entity.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Integer> {

}
