package dev.m_pluse.com.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private Company company;
	@ManyToOne
	private Department department;
	@ManyToOne
	TechnicalSpecification technicalSpecification;
	private LocalDate startDate;
	private LocalDate endDate;
	@OneToMany(mappedBy = "project")
	private List<Task> taskList;
	@OneToMany(mappedBy = "project")
	private List<Resource> resource;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name, Company company, Department department, TechnicalSpecification technicalSpecification,
			LocalDate startDate, LocalDate endDate) {
		super();
		this.name = name;
		this.company = company;
		this.department = department;
		this.technicalSpecification = technicalSpecification;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public TechnicalSpecification getTechnicalSpecification() {
		return technicalSpecification;
	}

	public void setTechnicalSpecification(TechnicalSpecification technicalSpecification) {
		this.technicalSpecification = technicalSpecification;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public List<Resource> getResource() {
		return resource;
	}

	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}
	
	

}
