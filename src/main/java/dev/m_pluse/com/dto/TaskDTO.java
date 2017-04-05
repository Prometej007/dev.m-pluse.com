package dev.m_pluse.com.dto;

import java.util.List;

public class TaskDTO {
	private int id;

	private List<Integer> developers;

	private String project;

	private String task;

	private boolean inProces;

	public TaskDTO() {

	}

	public TaskDTO(int id, List<Integer> developers, String project, String task, boolean inProces) {
		super();
		this.id = id;
		this.developers = developers;
		this.project = project;
		this.task = task;
		this.inProces = inProces;
	}

	public int getId() {
		return id;
	}

	public List<Integer> getDevelopers() {
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

	public void setDevelopers(List<Integer> developers) {
		this.developers = developers;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public void setInProces(boolean inProces) {
		this.inProces = inProces;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	

}
