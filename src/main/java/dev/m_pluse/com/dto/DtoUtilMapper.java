package dev.m_pluse.com.dto;

import java.util.ArrayList;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.Session;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.entity.TechnicalSpecification;

public class DtoUtilMapper {
	public CompanyDTO companyToCompanyDTO(Company company) {
		return new CompanyDTO(company.getId(), company.getName(), projectToString(company.getProject()),
				customerToCustomerDTO(company.getCustomer()), company.getStreet());
	}

	public DepartmentDTO departmentToDepartmentDTO(Department department) {
		return new DepartmentDTO(department.getId(), department.getName(), department.getEmail(), develoupers,
				projects);
	}

	public ProjectDTO projectToProjectDTO(Project project) {
return new ProjectDTO(project.getId(), project.getName(), project.getCompany().getName(), project.getDepartment().getName(), technicalSpecificationToTechnicalSpecificationDTO(project.getTechnicalSpecification()), project.getStartDate(), project.getEndDate(), taskToTaskDTO(project.getTaskList()), project.getResource(), ready)
	}

	public TechnicalSpecificationDTO technicalSpecificationToTechnicalSpecificationDTO(
			TechnicalSpecification technicalSpecification) {
		return new TechnicalSpecificationDTO(technicalSpecification.getId(),
				technicalSpecification.getFileSpecification().getPath());
	}

	public ResourceDTO resourceToResourceDTO(Resource resource) {
		return new ResourceDTO(resource.getId(), resource.getName(), type, resource.getPath());
	}

	public List<ResourceDTO> resourceToResourceDTO(List<Resource> resource) {
		List<ResourceDTO> list = new ArrayList<>();
		for (Resource obj : resource) {
			list.add(resourceToResourceDTO(obj));
		}
		return list;
	}

	public SessionDTO sessionToSessionDTO(Session session) {
		return new SessionDTO(session.getId(), session.getStartSession(), session.getFinishSession(),
				session.getReport(), session.getResource().getPath(), session.getProject().getName());
	}

	public List<SessionDTO> sessionToSessionDTO(List<Session> session) {
		List<SessionDTO> list = new ArrayList<SessionDTO>();
		for (Session obj : session) {
			list.add(sessionToSessionDTO(obj));
		}
		return list;
	}

	public DeveloperDTO developerToDeveloperDTO(Developer developer) {
		return new DeveloperDTO(developer.getId(), developer.getLogin(), developer.getPassword(), developer.getEmail(),
				developer.getFirstName(), developer.getLastName(), developer.getLastName(),
				developer.getDateOfEmployment(), developer.getDepartment().getName(), position,
				taskToTaskDTO(developer.getTask()), sessionToSessionDTO(developer.getSessions()));
	}

	public TaskDTO taskToTaskDTO(Task task) {
		return new TaskDTO(task.getId(), developerTOIndeterArray(task.getDevelopers()), task.getProject().getName(),
				task.isInProces());
	}

	public List<TaskDTO> taskToTaskDTO(List<Task> task) {
		List<TaskDTO> list = new ArrayList<>();
		for (Task obj : task) {
			list.add(taskToTaskDTO(obj));
		}
		return list;
	}

	public List<Integer> developerTOIndeterArray(List<Developer> developers) {
		List<Integer> list = new ArrayList<>();
		for (Developer obj : developers) {
			list.add(obj.getId());
		}
		return list;
	}

	public List<String> projectToString(List<Project> project) {
		List<String> list = new ArrayList<String>();
		for (Project obj : project) {
			list.add(obj.getName());
		}
		return list;
	}

	public CustomerDTO customerToCustomerDTO(Customer customer) {
		return new CustomerDTO(customer.getId(), customer.getLastName(), customer.getFirstName(),
				customer.getCompany().getName(), customer.getPosition(), customer.getPhoneNumber());
	}

	public List<CustomerDTO> customerToCustomerDTO(List<Customer> customer) {
		List<CustomerDTO> list = new ArrayList<>();
		for (Customer obj : customer) {
			list.add(customerToCustomerDTO(obj));
		}
		return list;
	}

}
