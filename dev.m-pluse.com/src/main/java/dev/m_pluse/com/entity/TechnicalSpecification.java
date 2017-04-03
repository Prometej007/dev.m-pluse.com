package dev.m_pluse.com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TechnicalSpecification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Resource fileSpecification;
	
	@OneToMany(mappedBy = "technicalSpecification")
	private List<Project> project;
	
	
	
	public TechnicalSpecification() {
		// TODO Auto-generated constructor stub
	}

	

	public TechnicalSpecification(Resource fileSpecification, List<Project> project) {
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

	

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}



	public Resource getFileSpecification() {
		return fileSpecification;
	}



	public void setFileSpecification(Resource fileSpecification) {
		this.fileSpecification = fileSpecification;
	}



	
	
	
	
}
