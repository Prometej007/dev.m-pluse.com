package dev.m_pluse.com.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Developer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private LocalDate dateOfEmployment;
	@ManyToOne
	private Department department;
	private Position position;
	@ManyToMany(mappedBy = "developers")
	private List<Task> task;

}
