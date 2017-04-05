package dev.m_pluse.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.m_pluse.com.dto.ChangeDeveloperInNewDepartmentDTO;
import dev.m_pluse.com.dto.DepartmentDTO;
import dev.m_pluse.com.dto.DtoUtilMapper;
import dev.m_pluse.com.entity.Department;
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
@RequestMapping("/restcontroller/department")
public class DepartmentController {
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
	public List<DepartmentDTO> addDepartment(@RequestParam("name") String name, @RequestParam("email") String email) {
		departmentService.createDepartment(name, email);
		return DtoUtilMapper.departmentToDepartmentDTO(departmentService.findAll());
	}

	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public List<DepartmentDTO> deleteDepartment(@RequestBody String id) {
		departmentService.delete(Integer.parseInt(id));
		return DtoUtilMapper.departmentToDepartmentDTO(departmentService.findAll());
	}

	@RequestMapping(value = "load", method = RequestMethod.POST)
	public List<DepartmentDTO> loadDepartments() {

		return DtoUtilMapper.departmentToDepartmentDTO(departmentService.findAll());
	}
	
	@RequestMapping(value = "changedepartment", method = RequestMethod.POST)
	public List<DepartmentDTO> loadDepartments(@RequestBody ChangeDeveloperInNewDepartmentDTO object) {
		departmentService.changeDeveloperInNewDepartment(object);
		return DtoUtilMapper.departmentToDepartmentDTO(departmentService.findAll());
	}

}
