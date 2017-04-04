package dev.m_pluse.com.dto;

import java.time.LocalDate;
import java.util.List;

public class ProjectDTO {
	private int id;
	private String name;

	private CompanyDTO company;

	private DepartmentDTO department;

	private TechnicalSpecificationDTO technicalSpecification;
	private LocalDate startDate;
	private LocalDate endDate;

	private List<TaskDTO> taskList;

	private List<ResourceDTO> resource;
	private boolean ready;

	public ProjectDTO() {
		super();
	}

	public ProjectDTO(int id, String name, CompanyDTO company, DepartmentDTO department,
			TechnicalSpecificationDTO technicalSpecification, LocalDate startDate, LocalDate endDate,
			List<TaskDTO> taskList, List<ResourceDTO> resource, boolean ready) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.department = department;
		this.technicalSpecification = technicalSpecification;
		this.startDate = startDate;
		this.endDate = endDate;
		this.taskList = taskList;
		this.resource = resource;
		this.ready = ready;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public TechnicalSpecificationDTO getTechnicalSpecification() {
		return technicalSpecification;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public List<TaskDTO> getTaskList() {
		return taskList;
	}

	public List<ResourceDTO> getResource() {
		return resource;
	}

	public boolean isReady() {
		return ready;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public void setTechnicalSpecification(TechnicalSpecificationDTO technicalSpecification) {
		this.technicalSpecification = technicalSpecification;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setTaskList(List<TaskDTO> taskList) {
		this.taskList = taskList;
	}

	public void setResource(List<ResourceDTO> resource) {
		this.resource = resource;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

}
