package dev.m_pluse.com.dto;

public class TechnicalSpecificationDTO {
	private int id;

	private ResourceDTO fileSpecification;

	public TechnicalSpecificationDTO() {
		super();
	}

	public TechnicalSpecificationDTO(int id, ResourceDTO fileSpecification) {
		super();
		this.id = id;
		this.fileSpecification = fileSpecification;
	}

	public int getId() {
		return id;
	}

	public ResourceDTO getFileSpecification() {
		return fileSpecification;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFileSpecification(ResourceDTO fileSpecification) {
		this.fileSpecification = fileSpecification;
	}

}
