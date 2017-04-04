package dev.m_pluse.com.service;

import java.time.LocalDate;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.TechnicalSpecification;

public interface ProjectService {

	void save(Project project);

	List<Project> findAll();

	Project findOne(int id);

	void delete(int id);

	public void createProject(String name, Company company, Department department,
			TechnicalSpecification technicalSpecification, LocalDate endDate);

	public List<Project> selectAllReadyProject();

	public List<Project> selectAllDontReadyProject();
}
