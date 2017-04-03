package dev.m_pluse.com.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private LocalDateTime startSession;
	private LocalDateTime finishSession;

	private String report;
	@OneToOne
	private Resource resource;
	@OneToOne
	private Project project;

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

//	PUBLIC PROJECT GETPROJECT() {
//		RETURN PROJECT;
//	}
//
//	PUBLIC VOID SETPROJECT(PROJECT PROJECT) {
//		THIS.PROJECT = PROJECT;
//	}

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

	public Resource getResource() {
		return resource;
	}

	public Developer getDeveloper() {
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

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + ((finishSession == null) ? 0 : finishSession.hashCode());
		result = prime * result + id;
		result = prime * result + ((report == null) ? 0 : report.hashCode());
		result = prime * result + ((resource == null) ? 0 : resource.hashCode());
		result = prime * result + ((startSession == null) ? 0 : startSession.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (finishSession == null) {
			if (other.finishSession != null)
				return false;
		} else if (!finishSession.equals(other.finishSession))
			return false;
		if (id != other.id)
			return false;
		if (report == null) {
			if (other.report != null)
				return false;
		} else if (!report.equals(other.report))
			return false;
		if (resource == null) {
			if (other.resource != null)
				return false;
		} else if (!resource.equals(other.resource))
			return false;
		if (startSession == null) {
			if (other.startSession != null)
				return false;
		} else if (!startSession.equals(other.startSession))
			return false;
		return true;
	}

}
