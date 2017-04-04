package dev.m_pluse.com.dto;

import java.util.List;

public class TaskDTO {
	private int id;

	private List<DeveloperDTO> developers;

	private String project;

	private boolean inProces;

	public TaskDTO() {

	}

	public TaskDTO(int id, List<DeveloperDTO> developers, String project, boolean inProces) {
		super();
		this.id = id;
		this.developers = developers;
		this.project = project;
		this.inProces = inProces;
	}

	public int getId() {
		return id;
	}

	public List<DeveloperDTO> getDevelopers() {
		return developers;
	}

	public String getProject() {
		return project;
	}

	public boolean isInProces() {
		return inProces;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDevelopers(List<DeveloperDTO> developers) {
		this.developers = developers;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public void setInProces(boolean inProces) {
		this.inProces = inProces;
	}

}
