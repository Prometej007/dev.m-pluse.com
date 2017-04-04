package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.TaskDao;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.service.TaskService;

@Service
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

	/**
	 * 
	 * @param project
	 * @param task
	 */

	public void createTaskList(Project project, Task task) {
		task.setProject(project);
		task.setInProces(false);

		save(task);
	}

	/**
	 * 
	 * @param task
	 * @param developers
	 */
	public void addDeveloper(Task task, List<Developer> developers) {
		List<Developer> list = task.getDevelopers();
		if (task.getDevelopers() != null) {
			list.addAll(developers);
		} else {
			list = developers;

			task.setDevelopers(list);

		}
		save(task);
	}

}
