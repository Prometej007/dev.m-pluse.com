package dev.m_pluse.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.m_pluse.com.dto.CustomerDTO;
import dev.m_pluse.com.dto.CustomerRegistrationDTO;
import dev.m_pluse.com.dto.DtoUtilMapper;
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
@RequestMapping("/restcontroller/customer")
public class CustomerCotroller {
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

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public List<CustomerDTO> addCustomer(@RequestBody CustomerRegistrationDTO customerRegistration) {
		customerService.add—ustomer(customerRegistration);
		return DtoUtilMapper.customerToCustomerDTO(customerService.findAll());
	}

	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public List<CustomerDTO> addCustomer(@RequestBody String id) {
		customerService.delete(Integer.parseInt(id));
		return DtoUtilMapper.customerToCustomerDTO(customerService.findAll());
	}

	@RequestMapping(value = "load", method = RequestMethod.PUT)
	public List<CustomerDTO> addCustomer() {

		return DtoUtilMapper.customerToCustomerDTO(customerService.findAll());
	}
	@RequestMapping(value = "loadWithCompany", method = RequestMethod.PUT)
	public List<CustomerDTO> getAllCustomerWithCompany(@RequestParam("company") String company) {

		return DtoUtilMapper.customerToCustomerDTO(customerService.getAllCustomerWithCompany(Integer.parseInt(company)));
	}

}
