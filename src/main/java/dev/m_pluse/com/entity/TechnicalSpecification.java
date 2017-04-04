package dev.m_pluse.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class TechnicalSpecification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Resource fileSpecification;
	
	
	
	
	public TechnicalSpecification() {
		
	}

	

	public TechnicalSpecification(Resource fileSpecification) {
		super();
		this.fileSpecification = fileSpecification;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public Resource getFileSpecification() {
		return fileSpecification;
	}



	public void setFileSpecification(Resource fileSpecification) {
		this.fileSpecification = fileSpecification;
	}



	
	
	
	
}
