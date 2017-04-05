package dev.m_pluse.com.dto;

public class TechnicalSpecificationDTO {

	private int id;

	private String fileSpecification;

	public TechnicalSpecificationDTO() {
		super();
	}

	public TechnicalSpecificationDTO(int id, String fileSpecification) {
		super();
		this.id = id;
		this.fileSpecification = fileSpecification;
	}

	public int getId() {
		return id;
	}

	public String getFileSpecification() {
		return fileSpecification;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFileSpecification(String fileSpecification) {
		this.fileSpecification = fileSpecification;
	}

}
