package com.capgemini.person.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int personid;
	private String personName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private PersonalData details;
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	@JoinColumn
	private PersonCertifications certificates;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personid, String personName, PersonalData details) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.details = details;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public PersonalData getDetails() {
		return details;
	}

	public void setDetails(PersonalData details) {
		this.details = details;
	}
	
}
