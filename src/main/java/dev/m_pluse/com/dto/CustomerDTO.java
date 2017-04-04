package dev.m_pluse.com.dto;

public class CustomerDTO {
	private int id;
	private String lastName;
	private String FirstName;

	private String company;
	private String position;
	private String phoneNumber;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(int id, String lastName, String firstName, String company, String position, String phoneNumber) {
		super();
		this.id = id;
		this.lastName = lastName;
		FirstName = firstName;
		this.company = company;
		this.position = position;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getCompany() {
		return company;
	}

	public String getPosition() {
		return position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
