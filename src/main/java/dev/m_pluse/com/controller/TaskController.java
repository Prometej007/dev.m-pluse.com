package dev.m_pluse.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.m_pluse.com.dto.DtoUtilMapper;
import dev.m_pluse.com.dto.TaskDTO;
import dev.m_pluse.com.service.CompanyService;
import dev.m_pluse.com.service.CustomerService;
import dev.m_pluse.com.service.DepartmentService;
import dev.m_pluse.com.service.DeveloperService;
import dev.m_pluse.com.service.ProjectService;
import dev.m_pluse.com.service.ResourceService;
import dev.m_pluse.com.service.SessionService;
import dev.m_pluse.com.service.TaskService;
import dev.m_pluse.com.service.TechnicalSpecificationService;
import dev.m_pluse.com.service.UuidService;

@RestController
@RequestMapping("/restcontroller/task")
public class TaskController {
	@Autowired
	private CompanyService companyService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DeveloperService developerService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ResourceService resourceService;
	@Autowired
	private SessionService sessionService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private TechnicalSpecificationService technicalSpecificationService;
	@Autowired
	private UuidService uuidService;

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add(@RequestBody List<TaskDTO> taskDto) {
		for (TaskDTO obj : taskDto) {
			taskService.createTaskList(obj.getTask(), obj.getProject());
		}

	}

	@RequestMapping(value = "createtasklist", method = RequestMethod.GET)
	public List<TaskDTO> load(@RequestParam("nameProject") String nameProject, @RequestParam("task") String task) {
		taskService.createTaskList(nameProject, task);
		return DtoUtilMapper.taskToTaskDTO(projectService.findOneByName(nameProject).getTaskList());

	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public void update(@RequestParam("dev") List<Integer> dev, @RequestParam("task") String task,
			@RequestParam("project") String project) {
		taskService.addDeveloperInTaskList(task, dev, project);

	}
	@RequestMapping(value="load",method = RequestMethod.PUT)
	public List<TaskDTO> load(@RequestBody String project){
		
		return DtoUtilMapper.taskToTaskDTO(taskService.fundAll(project));  
	}

}
