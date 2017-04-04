package dev.m_pluse.com.dto;

import java.util.List;

public class ResourceDTO {

	private int id;
	private String name;
	private String type;
	private ProjectDTO project;
	private String path;
	private List<TechnicalSpecificationDTO> technicalSpecifications;

	public ResourceDTO() {
		super();
	}

	public ResourceDTO(int id, String name, String type, ProjectDTO project, String path,
			List<TechnicalSpecificationDTO> technicalSpecifications) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.project = project;
		this.path = path;
		this.technicalSpecifications = technicalSpecifications;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public ProjectDTO getProject() {
		return project;
	}

	public String getPath() {
		return path;
	}

	public List<TechnicalSpecificationDTO> getTechnicalSpecifications() {
		return technicalSpecifications;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setTechnicalSpecifications(List<TechnicalSpecificationDTO> technicalSpecifications) {
		this.technicalSpecifications = technicalSpecifications;
	}

}
