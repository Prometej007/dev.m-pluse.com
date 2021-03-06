package dev.m_pluse.com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToMany
	@JoinTable(name = "developer_task", joinColumns = @JoinColumn(name = "id_task"), inverseJoinColumns = @JoinColumn(name = "id_developer"))
	private List<Developer> developers;
	@ManyToOne
	private Project project;

	private String task;

	private boolean inProces;

	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(Project project) {
		super();
		this.project = project;
	}

	public Task(List<Developer> developers, Project project, boolean inProces) {
		super();
		this.developers = developers;
		this.project = project;
		this.inProces = inProces;
	}

	public int getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public boolean isInProces() {
		return inProces;
	}

	public void setInProces(boolean inProces) {
		this.inProces = inProces;
	}

}
