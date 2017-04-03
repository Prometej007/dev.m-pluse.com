package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DepartmentDao;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	public void save(Department department) {
		departmentDao.save(department);
	}

	public List<Department> findAll() {

		return departmentDao.findAll();
	}

	public Department findOne(int id) {

		return departmentDao.findOne(id);
	}

	public void delete(int id) {
		departmentDao.delete(id);

	}

	/**
	 * 
	 * @param name
	 * @param email
	 * @param develoupers
	 */
	public void createDepartment(String name, String email, List<Developer> develoupers) {
		Department department = new Department();
		department.setEmail(email);
		department.setDeveloupers(develoupers);
		department.setName(name);
		save(department);
	}

	/**
	 * 
	 * @param department
	 * @param developer
	 */
	public void addDeveloperInDepartment(Department department, Developer developer) {
		List<Developer> list = department.getDeveloupers();
		if (list != null) {
			list.add(developer);
		} else {
			list = new ArrayList<Developer>();
			list.add(developer);
		}
		save(department);

	}

	/**
	 * 
	 * @param department
	 * @param developers
	 */
	public void addDevelopersInDepartment(Department department, List<Developer> developers) {
		List<Developer> list = department.getDeveloupers();
		if (list != null) {
			list.addAll(developers);
		} else {
			list = new ArrayList<Developer>();
			list.addAll(developers);
		}
		save(department);

	}

}
