package dev.m_pluse.com.dto;

import java.util.List;

import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.entity.Project;

public class CompanyDTO {
	private int id;
	private String name;

	private List<ProjectDTO> project;

	private List<CustomerDTO> customer;
	private String street;

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(int id, String name, List<Project> project, List<Customer> customer, String street) {
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

	public List<Project> getProject() {
		return project;
	}

	public List<Customer> getCustomer() {
		return customer;
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

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
