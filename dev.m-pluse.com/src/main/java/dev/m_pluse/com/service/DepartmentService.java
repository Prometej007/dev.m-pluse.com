package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;

public interface DepartmentService {
	void save(Department department);

	List<Department> findAll();

	Department findOne(int id);

	void delete(int id);

	public void createDepartment(String name, String email, List<Developer> develoupers);

	public void addDeveloperInDepartment(Department department, Developer developer);

	public void addDevelopersInDepartment(Department department, List<Developer> developers);
}
