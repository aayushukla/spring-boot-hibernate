package com.capgemini.person.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonalData {

	@Id
	private int detailId;
	private String bloodGroup;
	private double height;
	private double weight;

	@OneToOne(mappedBy = "details")
	private Person person;

	public PersonalData(int detailId, String bloodGroup, double height, double weight) {
		super();
		this.detailId = detailId;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
	
	}

	public PersonalData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	
}
