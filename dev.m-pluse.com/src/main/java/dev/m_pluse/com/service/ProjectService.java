package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;

public interface ProjectService {

	void save(Project project);

	List<Project> findAll();

	Project findOne(int id);

	void delete(int id);

}
