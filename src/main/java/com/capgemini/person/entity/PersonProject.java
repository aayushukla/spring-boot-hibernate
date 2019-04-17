package com.capgemini.person.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="personproject")
public class PersonProject {
	
	@ManyToMany
	@JoinColumn
	private List<Person> person;
	
	@Id
	@Column(name="personid")
	private int projectId;
	private String projectName;
	
	
	public PersonProject(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public PersonProject() {
		super();
		// TODO Auto-generated constructor stub
	}
}
