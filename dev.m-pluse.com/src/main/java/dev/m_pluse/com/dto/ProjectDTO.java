package dev.m_pluse.com.dto;

import java.time.LocalDate;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.entity.TechnicalSpecification;

public class ProjectDTO {
	private int id;
	private String name;

	private Company company;

	private Department department;

	private TechnicalSpecification technicalSpecification;
	private LocalDate startDate;
	private LocalDate endDate;

	private List<Task> taskList;

	private List<Resource> resource;
	private boolean ready;
}
