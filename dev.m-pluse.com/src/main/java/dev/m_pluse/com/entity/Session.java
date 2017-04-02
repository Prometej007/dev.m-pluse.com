package dev.m_pluse.com.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDateTime startSession;
	private LocalDateTime finishSession;
	
	private String report;
	private String pathReport;
	
	@ManyToOne
	private Developer developer;
	
	public Session() {
		// TODO Auto-generated constructor stub
	}

	public Session(LocalDateTime startSession, LocalDateTime finishSession, String report) {
		super();
		this.startSession = startSession;
		this.finishSession = finishSession;
		this.report = report;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getStartSession() {
		return startSession;
	}

	public void setStartSession(LocalDateTime startSession) {
		this.startSession = startSession;
	}

	public LocalDateTime getFinishSession() {
		return finishSession;
	}

	public void setFinishSession(LocalDateTime finishSession) {
		this.finishSession = finishSession;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getPathReport() {
		return pathReport;
	}

	public void setPathReport(String pathReport) {
		this.pathReport = pathReport;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	
}
