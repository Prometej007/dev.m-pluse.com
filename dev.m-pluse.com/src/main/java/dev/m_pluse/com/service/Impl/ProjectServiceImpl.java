package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.m_pluse.com.dao.ProjectDao;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.service.ProjectService;

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

}
