package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Task;

public interface TaskService {
	void save(Task task);

	List<Task> findAll();

	Task findOne(int id);

	void delete(int id);

	public Task findOneByTusk(String task, String nameProject);

	public void createTaskList(String nameProject, String task);

	public void addDeveloperInTaskList(String task, List<Integer> developers, String projectName);
	
	List<Task> fundAll(String project);
}
