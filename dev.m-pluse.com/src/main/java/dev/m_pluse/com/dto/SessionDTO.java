package dev.m_pluse.com.dto;

import java.time.LocalDateTime;

public class SessionDTO {
	private int id;

	private LocalDateTime startSession;
	private LocalDateTime finishSession;

	private String report;

	private String resource;

	private String project;

	public SessionDTO() {
		super();
	}

	public SessionDTO(int id, LocalDateTime startSession, LocalDateTime finishSession, String report,
			String resource, String project) {
		super();
		this.id = id;
		this.startSession = startSession;
		this.finishSession = finishSession;
		this.report = report;
		this.resource = resource;
		this.project = project;

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

	public String getResource() {
		return resource;
	}

	public String getProject() {
		return project;
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

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
