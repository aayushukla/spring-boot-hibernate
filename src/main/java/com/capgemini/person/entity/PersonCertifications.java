package com.capgemini.person.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class PersonCertifications {
	
	@Id
	private int certificationId;
	private String certificationDesc;
	@ManyToOne
	@JoinColumn
    private Person person;

	public int getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}

	public String getCertificationDesc() {
		return certificationDesc;
	}

	public void setCertificationDesc(String certificationDesc) {
		this.certificationDesc = certificationDesc;
	}

	public PersonCertifications(int certificationId, String certificationDesc) {
		super();
		this.certificationId = certificationId;
		this.certificationDesc = certificationDesc;

	}

	public PersonCertifications() {
		super();
		
	}

	
	
		
	

}
