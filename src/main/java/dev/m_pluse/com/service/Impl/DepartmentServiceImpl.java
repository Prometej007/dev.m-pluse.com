package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DepartmentDao;
import dev.m_pluse.com.dao.DeveloperDao;
import dev.m_pluse.com.dto.ChangeDeveloperInNewDepartmentDTO;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private DeveloperDao developerDao;

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
	 * @param int
	 *            idDepartment
	 * @param int
	 *            idDeveloper
	 */
	public void changeDeveloperInNewDepartment(ChangeDeveloperInNewDepartmentDTO object) {
		Department department = departmentDao.findOne(object.getIdDepartment());
		List<Developer> list = department.getDeveloupers();
		if (list != null) {
			list.add(developerDao.findOne(object.getIdDeveloper()));

		} else {
			list = new ArrayList<Developer>();
			list.add(developerDao.findOne(object.getIdDeveloper()));
		}
		department.setDeveloupers(list);
		save(department);

	}

}
