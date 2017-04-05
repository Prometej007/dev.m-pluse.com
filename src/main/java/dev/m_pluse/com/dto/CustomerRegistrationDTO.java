package dev.m_pluse.com.dto;

public class CustomerRegistrationDTO {

	private String lastName;
	private String FirstName;
	private int company;
	private String position;
	private String phoneNumber;

	public CustomerRegistrationDTO() {
		super();
	}

	public CustomerRegistrationDTO(String lastName, String firstName, int company, String position,
			String phoneNumber) {
		super();
		this.lastName = lastName;
		FirstName = firstName;
		this.company = company;
		this.position = position;
		this.phoneNumber = phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public int getCompany() {
		return company;
	}

	public String getPosition() {
		return position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
