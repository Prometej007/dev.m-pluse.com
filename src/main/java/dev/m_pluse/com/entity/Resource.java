package dev.m_pluse.com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private ResourceType type;
	@ManyToOne
	private Project project;
	private String path;
	@OneToMany(mappedBy="fileSpecification")
	private List<TechnicalSpecification> technicalSpecifications;
	
	public Resource() {

	}

	public Resource(String name, ResourceType type, Project project, String path) {
		super();
		this.name = name;
		this.type = type;
		this.project = project;
		this.path = path;
	}
	
	public Resource(String name, ResourceType type, String path) {
		super();
		this.name = name;
		this.type = type;
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<TechnicalSpecification> getTechnicalSpecifications() {
		return technicalSpecifications;
	}

	public void setTechnicalSpecifications(List<TechnicalSpecification> technicalSpecifications) {
		this.technicalSpecifications = technicalSpecifications;
	}


}
