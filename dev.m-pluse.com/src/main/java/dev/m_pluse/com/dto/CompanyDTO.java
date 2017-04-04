package dev.m_pluse.com.dto;

import java.util.List;

public class CompanyDTO {
	private int id;
	private String name;

	private List<ProjectDTO> project;

	private List<CustomerDTO> customer;
	private String street;

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(int id, String name, List<ProjectDTO> project, List<CustomerDTO> customer, String street) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.customer = customer;
		this.street = street;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProjectDTO> getProject() {
		return project;
	}

	public List<CustomerDTO> getCustomer() {
		return customer;
	}

	public void setProject(List<ProjectDTO> project) {
		this.project = project;
	}

	public void setCustomer(List<CustomerDTO> customer) {
		this.customer = customer;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
