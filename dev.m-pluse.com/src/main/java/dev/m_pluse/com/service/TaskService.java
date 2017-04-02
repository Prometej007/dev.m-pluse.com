package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Task;

public interface TaskService {
	void save(Task task);

	List<Task> findAll();

	Task findOne(int id);

	void delete(int id);
}
