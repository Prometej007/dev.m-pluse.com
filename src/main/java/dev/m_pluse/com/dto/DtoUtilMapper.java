package dev.m_pluse.com.dto;

import java.util.ArrayList;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.entity.Session;
import dev.m_pluse.com.entity.Task;
import dev.m_pluse.com.entity.TechnicalSpecification;

public class DtoUtilMapper {
	public CompanyDTO companyToCompanyDTO(Company company) {
		return new CompanyDTO(company.getId(), company.getName(), projectToString(company.getProject()),
				customerToCustomerDTO(company.getCustomer()), company.getStreet());
	}

	public DepartmentDTO departmentToDepartmentDTO(Department department) {
		return new DepartmentDTO(department.getId(), department.getName(), department.getEmail(),
				developerToDeveloperDTO(department.getDeveloupers()), projectToProjectDTO(department.getProjects()));
	}

	public ProjectDTO projectToProjectDTO(Project project) {
		return new ProjectDTO(project.getId(), project.getName(), project.getCompany().getName(),
				project.getDepartment().getName(),
				technicalSpecificationToTechnicalSpecificationDTO(project.getTechnicalSpecification()),
				project.getStartDate(), project.getEndDate(), taskToTaskDTO(project.getTaskList()),
				resourceToResourceDTO(project.getResource()), project.isReady());
	}

	public List<ProjectDTO> projectToProjectDTO(List<Project> project) {
		List<ProjectDTO> list = new ArrayList<ProjectDTO>();
		for (Project obj : project) {
			list.add(projectToProjectDTO(obj));
		}
		return list;
	}

	public TechnicalSpecificationDTO technicalSpecificationToTechnicalSpecificationDTO(
			TechnicalSpecification technicalSpecification) {
		return new TechnicalSpecificationDTO(technicalSpecification.getId(),
				technicalSpecification.getFileSpecification().getPath());
	}

	public ResourceDTO resourceToResourceDTO(Resource resource) {
		return new ResourceDTO(resource.getId(), resource.getName(), resourceType(resource.getType()),
				resource.getPath());
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
				developer.getFirstName(), developer.getLastName(), developer.getDateOfBirth(),
				developer.getDateOfEmployment(), developer.getDepartment().getName(), position(developer.getPosition()),
				taskToTaskDTO(developer.getTask()), sessionToSessionDTO(developer.getSessions()));
	}

	public List<DeveloperDTO> developerToDeveloperDTO(List<Developer> developer) {
		List<DeveloperDTO> list = new ArrayList<DeveloperDTO>();
		for (Developer obj : developer) {
			developerToDeveloperDTO(obj);
		}
		return list;
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

	public String position(Position position) {

		switch (position) {
		case ROLE_ONE_OF_BOSS:
			return "BIG BOSS";
		case ROLE_MANAGER:
			return "Manager";
		case ROLE_TECHLEAD:
			return "Techlead";
		case ROLE_TEAMLEAD:
			return "Teamlead";
		case ROLE_SENIOR:
			return "Senior";
		case ROLE_MIDDLE:
			return "Middle";
		case ROLE_JUNIOR:
			return "Junior";
		case ROLE_TRAINEE:
			return "Trainee";

		default:
			break;
		}

		return null;
	}

	public Position getPosition(String position) {

		switch (position) {
		case "BIG BOSS":
			return Position.ROLE_ONE_OF_BOSS;
		case "Manager":
			return Position.ROLE_MANAGER;
		case "Techlead":
			return Position.ROLE_TECHLEAD;
		case "Teamlead":
			return Position.ROLE_TEAMLEAD;
		case "Senior":
			return Position.ROLE_SENIOR;
		case "Middle":
			return Position.ROLE_MIDDLE;
		case "Junior":
			return Position.ROLE_JUNIOR;
		case "Trainee":
			return Position.ROLE_TRAINEE;

		default:
			break;
		}

		return null;

	}

	public String resourceType(ResourceType resourceType) {

		switch (resourceType) {
		case DECELOPER_RESOURCE:
			return "Developer resource";
		case DEVELOPER_AUDIO:
			return "Developer audio";
		case DEVELOPER_IMG:
			return "Developer img";
		case DEVELOPER_VIDOE:
			return "Developer video";
		case PROJECT_RESOURCE:
			return "Project resources";
		case PROJECT_RESOURCE_GITHUB:
			return "Project resources from Gitub";
		case SESSION_DATA:
			return "Session data";
		case SESSION_REPORT:
			return "Session report";

		default:
			break;
		}

		return null;
	}

	public ResourceType getResourceType(String resourcesType) {

		switch (resourcesType) {
		case "Developer resource":
			return ResourceType.DECELOPER_RESOURCE;
		case "Developer audio":
			return ResourceType.DEVELOPER_AUDIO;
		case "Developer img":
			return ResourceType.DEVELOPER_IMG;
		case "Developer video":
			return ResourceType.DEVELOPER_VIDOE;
		case "Project resources":
			return ResourceType.PROJECT_RESOURCE;
		case "Project resources from Gitub":
			return ResourceType.PROJECT_RESOURCE_GITHUB;
		case "Session data":
			return ResourceType.SESSION_DATA;
		case "Session report":
			return ResourceType.SESSION_REPORT;

		default:
			break;
		}

		return null;

	}

}
