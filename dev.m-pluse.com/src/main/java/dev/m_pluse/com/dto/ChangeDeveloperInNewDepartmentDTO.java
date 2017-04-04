package dev.m_pluse.com.dto;

public class ChangeDeveloperInNewDepartmentDTO {
	private int idDepartment;
	private int idDeveloper;

	public ChangeDeveloperInNewDepartmentDTO() {
		super();
	}

	public ChangeDeveloperInNewDepartmentDTO(int idDepartment, int idDeveloper) {
		super();
		this.idDepartment = idDepartment;
		this.idDeveloper = idDeveloper;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public int getIdDeveloper() {
		return idDeveloper;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public void setIdDeveloper(int idDeveloper) {
		this.idDeveloper = idDeveloper;
	}

}
