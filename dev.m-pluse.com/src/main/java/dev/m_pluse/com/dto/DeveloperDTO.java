package dev.m_pluse.com.dto;

import java.time.LocalDate;
import java.util.List;

public class DeveloperDTO {
	private int id;
	private String login;
	private String password;
	private String email;

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private LocalDate dateOfEmployment;

	private DepartmentDTO department;
	private String position;

	private List<TaskDTO> task;

	private List<SessionDTO> sessions;

	public DeveloperDTO() {
		super();
	}

	public DeveloperDTO(int id, String login, String password, String email, String firstName, String lastName,
			LocalDate dateOfBirth, LocalDate dateOfEmployment, DepartmentDTO department, String position,
			List<TaskDTO> task, List<SessionDTO> sessions) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfEmployment = dateOfEmployment;
		this.department = department;
		this.position = position;
		this.task = task;
		this.sessions = sessions;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDate getDateOfEmployment() {
		return dateOfEmployment;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public List<TaskDTO> getTask() {
		return task;
	}

	public List<SessionDTO> getSessions() {
		return sessions;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfEmployment(LocalDate dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setTask(List<TaskDTO> task) {
		this.task = task;
	}

	public void setSessions(List<SessionDTO> sessions) {
		this.sessions = sessions;
	}

}
