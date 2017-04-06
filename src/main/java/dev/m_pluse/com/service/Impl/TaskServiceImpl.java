package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.TaskDao;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.service.DeveloperService;
import dev.m_pluse.com.service.ProjectService;
import dev.m_pluse.com.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao taskDao;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private DeveloperService developerService;

	public void save(Task task) {
		taskDao.save(task);

	}

	public List<Task> findAll() {

		return taskDao.findAll();
	}

	public Task findOne(int id) {

		return taskDao.findOne(id);
	}

	public Task findOneByTusk(String task, String nameProject) {
		for (Task obj : findAll()) {
			if (obj.getProject().getName().equals(nameProject) && obj.getTask().equals(task)) {
				return obj;
			}
		}

		return null;
	}

	public void delete(int id) {
		taskDao.delete(id);

	}

	/**
	 * 
	 * @param project
	 * @param task
	 */

	public void createTaskList(String nameProject, String task) {
		Project project = projectService.findOneByName(nameProject);

		Task obj = new Task(project);
		obj.setTask(task);
		obj.setInProces(false);

		save(obj);
	}

	/**
	 * 
	 * @param task
	 * @param developers
	 */
	public void addDeveloperInTaskList(String task, List<Integer> developers, String projectName) {
		Task objTask = findOneByTusk(task, projectName);
		List<Developer> dev = objTask.getDevelopers();
		for (Integer id : developers) {
			dev.add(developerService.findOne(id));
		}
		objTask.setDevelopers(dev);
		save(objTask);
	}

	public List<Task> fundAll(String project) {

		return projectService.findOneByName(project).getTaskList();
	}

}
