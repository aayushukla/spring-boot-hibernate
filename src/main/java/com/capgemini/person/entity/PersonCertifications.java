package com.capgemini.person.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class PersonCertifications {
	
	@Id
	private int certificationId;
	private String certificationDesc;
	
	
	@ManyToOne
    private List<Person> person;

	public PersonCertifications(int certificationId, String certificationDesc, List<Person> person) {
		super();
		this.certificationId = certificationId;
		this.certificationDesc = certificationDesc;
		this.person = person;
	}

	public PersonCertifications() {
		super();
		
	}

	
	
		
	

}
