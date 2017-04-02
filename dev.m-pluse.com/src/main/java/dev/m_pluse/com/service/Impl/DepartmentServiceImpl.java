package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DepartmentDao;
import dev.m_pluse.com.entity.Department;
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

}
