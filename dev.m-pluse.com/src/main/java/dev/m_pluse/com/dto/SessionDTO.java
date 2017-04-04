package dev.m_pluse.com.dto;

import java.time.LocalDateTime;

public class SessionDTO {
	private int id;

	private LocalDateTime startSession;
	private LocalDateTime finishSession;

	private String report;

	private ResourceDTO resource;

	private ProjectDTO project;

	private DeveloperDTO developer;

	public SessionDTO() {
		super();
	}

	public SessionDTO(int id, LocalDateTime startSession, LocalDateTime finishSession, String report,
			ResourceDTO resource, ProjectDTO project, DeveloperDTO developer) {
		super();
		this.id = id;
		this.startSession = startSession;
		this.finishSession = finishSession;
		this.report = report;
		this.resource = resource;
		this.project = project;
		this.developer = developer;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartSession() {
		return startSession;
	}

	public LocalDateTime getFinishSession() {
		return finishSession;
	}

	public String getReport() {
		return report;
	}

	public ResourceDTO getResource() {
		return resource;
	}

	public ProjectDTO getProject() {
		return project;
	}

	public DeveloperDTO getDeveloper() {
		return developer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStartSession(LocalDateTime startSession) {
		this.startSession = startSession;
	}

	public void setFinishSession(LocalDateTime finishSession) {
		this.finishSession = finishSession;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public void setResource(ResourceDTO resource) {
		this.resource = resource;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public void setDeveloper(DeveloperDTO developer) {
		this.developer = developer;
	}

}
