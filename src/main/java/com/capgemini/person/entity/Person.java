package com.capgemini.person.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@Column(name="personid")
	private int personid;
	private String personName;

	@OneToOne(cascade = CascadeType.ALL)

	@JoinColumn(unique = true)
	private PersonalData details;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)

	private List<PersonCertifications> certificates;

	@ManyToMany
	 @JoinTable(name ="person_personproject",
	 joinColumns = @JoinColumn(name = "personid"),
	 inverseJoinColumns = @JoinColumn(name = "projectid"))

	private List<PersonProject> projects;

	public Person(int personid, String personName, List<PersonCertifications> certificates,
			List<PersonProject> projects) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.certificates = certificates;
		this.projects = projects;
	}

	public Person(int personid, String personName, List<PersonCertifications> certificates) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.certificates = certificates;
	}

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

	public List<PersonCertifications> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<PersonCertifications> certificates) {
		this.certificates = certificates;
	}

	public PersonalData getDetails() {
		return details;
	}

	public void setDetails(PersonalData details) {
		this.details = details;
	}

	public List<PersonProject> getProjects() {
		return projects;
	}

	public void setProjects(List<PersonProject> projects) {
		this.projects = projects;
	}

}
