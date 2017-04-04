package dev.m_pluse.com.dto;

public class ResourceDTO {

	private int id;
	private String name;
	private String type;
	private String path;

	public ResourceDTO() {
		super();
	}

	public ResourceDTO(int id, String name, String type, String path) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.path = path;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getPath() {
		return path;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
