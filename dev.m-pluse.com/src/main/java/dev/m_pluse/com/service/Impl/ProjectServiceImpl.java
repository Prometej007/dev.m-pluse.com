package dev.m_pluse.com.service.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.ProjectDao;
import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.TechnicalSpecification;
import dev.m_pluse.com.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;

	public void save(Project project) {
		projectDao.save(project);

	}

	public List<Project> findAll() {

		return projectDao.findAll();
	}

	public Project findOne(int id) {

		return projectDao.findOne(id);
	}

	public void delete(int id) {
		projectDao.delete(id);

	}

	/**
	 * @param String
	 *            name
	 * @param Company
	 *            company
	 * @param Department
	 *            department
	 * @param TechnicalSpecification
	 *            technicalSpecification
	 * @param LocalDate
	 *            endDate
	 */
	public void createProject(String name, Company company, Department department,
			TechnicalSpecification technicalSpecification, LocalDate endDate) {
		Project project = new Project();
		project.setName(name);
		project.setDepartment(department);
		project.setStartDate(LocalDate.now());
		project.setEndDate(endDate);
		project.setCompany(company);
		project.setTechnicalSpecification(technicalSpecification);
		save(project);
	}

}
