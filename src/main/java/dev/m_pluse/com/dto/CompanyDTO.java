package dev.m_pluse.com.dto;

import java.util.List;

public class CompanyDTO {
	private int id;
	private String name;

	private List<String> project;

	private List<CustomerDTO> customer;
	private String street;

	public CompanyDTO() {
		super();
	}

	public CompanyDTO(int id, String name, List<String> project, List<CustomerDTO> customer, String street) {
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

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<CustomerDTO> getCustomer() {
		return customer;
	}

	public void setCustomer(List<CustomerDTO> customer) {
		this.customer = customer;
	}

}
