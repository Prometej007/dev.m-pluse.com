package dev.m_pluse.com.dto;

import java.util.List;

public class DepartmentDTO {

	private int id;
	private String name;
	private String email;

	private List<DeveloperDTO> develoupers;

	private List<ProjectDTO> projects;

	public DepartmentDTO() {
		super();
	}

	public DepartmentDTO(int id, String name, String email, List<DeveloperDTO> develoupers, List<ProjectDTO> projects) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.develoupers = develoupers;
		this.projects = projects;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<DeveloperDTO> getDeveloupers() {
		return develoupers;
	}

	public List<ProjectDTO> getProjects() {
		return projects;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDeveloupers(List<DeveloperDTO> develoupers) {
		this.develoupers = develoupers;
	}

	public void setProjects(List<ProjectDTO> projects) {
		this.projects = projects;
	}

}
