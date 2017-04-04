package dev.m_pluse.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Uuid {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String uuid;
	@OneToOne
	private Developer developer;

	private UuidType type;

	public Uuid() {

	}

	public Uuid(String uuid, Developer developer, UuidType type) {
		super();
		this.uuid = uuid;
		this.developer = developer;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public UuidType getType() {
		return type;
	}

	public void setType(UuidType type) {
		this.type = type;
	}

}
