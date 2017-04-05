package dev.m_pluse.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.m_pluse.com.dto.DtoUtilMapper;
import dev.m_pluse.com.dto.TechnicalSpecificationDTO;
import dev.m_pluse.com.entity.Resource;
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
@RequestMapping("/restcontroller/technicalSpecification")
public class TechnicalSpecificationController {
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
	public TechnicalSpecificationDTO add(@RequestParam("name") String name, @RequestParam("type") String type,
			@RequestParam("path") String path) {

		return DtoUtilMapper.technicalSpecificationToTechnicalSpecificationDTO(technicalSpecificationService
				.createTechnicalSpecification(new Resource(name, DtoUtilMapper.getResourceType(type), path)));

	}

	@RequestMapping(value = "load", method = RequestMethod.PUT)
	public TechnicalSpecificationDTO load(@RequestParam("id") String id) {

		return DtoUtilMapper.technicalSpecificationToTechnicalSpecificationDTO(
				technicalSpecificationService.findOne(Integer.parseInt(id)));

	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public TechnicalSpecificationDTO update(@RequestParam("id") String id) {
		return null;
	}

}
