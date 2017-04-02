package dev.m_pluse.com.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private Company company;
	@ManyToOne
	private Department department;
	@ManyToOne
	TechnicalSpecification technicalSpecification;
	private LocalDate startDate;
	private LocalDate endDate;
	@OneToMany(mappedBy = "project")
	private List<Task> taskList;
	@OneToMany(mappedBy = "project")
	private List<Resource> resource;

}
