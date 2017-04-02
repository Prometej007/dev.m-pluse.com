package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Department;

public interface DepartmentService {
	void save(Department department);

	List<Department> findAll();

	Department findOne(int id);

	void delete(int id);
}
