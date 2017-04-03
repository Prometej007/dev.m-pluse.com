package dev.m_pluse.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TechnicalSpecification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Resource fileSpecification;
	
	
	private Project project;
	
	
	
	public TechnicalSpecification() {
		// TODO Auto-generated constructor stub
	}

	

	public TechnicalSpecification(Resource fileSpecification, Project project) {
		super();
		this.fileSpecification = fileSpecification;
		this.project = project;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}



	public Resource getFileSpecification() {
		return fileSpecification;
	}



	public void setFileSpecification(Resource fileSpecification) {
		this.fileSpecification = fileSpecification;
	}



	
	
	
	
}
