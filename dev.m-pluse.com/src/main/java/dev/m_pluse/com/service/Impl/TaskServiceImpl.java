package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.m_pluse.com.dao.TaskDao;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.service.TaskService;

public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao taskDao;

	public void save(Task task) {
		taskDao.save(task);

	}

	public List<Task> findAll() {

		return taskDao.findAll();
	}

	public Task findOne(int id) {

		return taskDao.findOne(id);
	}

	public void delete(int id) {
		taskDao.delete(id);

	}

}
