package dev.m_pluse.com.dto;

import java.util.ArrayList;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Session;

public class DtoUtilMapper {

	List<CustomerDTO> customerTo—ustomerDTO(List<Customer> list) {
		List<CustomerDTO> dto = new ArrayList<CustomerDTO>();
		for (Customer Òustomer : list) {
			dto.add(new CustomerDTO(Òustomer.getId(), Òustomer.getLastName(), Òustomer.getFirstName(),
					Òustomer.getCompany(), Òustomer.getPosition(), Òustomer.getPhoneNumber()));
		}
		return dto;
	}

	List<CompanyDTO> companyToCompanyDTO(List<Company> list) {
		List<CompanyDTO> dto = new ArrayList<CompanyDTO>();
		for (Company company : list) {
			dto.add(new CompanyDTO(company.getId(), company.getName(), company.getProject(), company.getCustomer(),
					company.getStreet()));
		}
		return dto;
	}

	List<DepartmentDTO> departmentToDepartmentDTO(List<Department> list) {
		List<DepartmentDTO> dto = new ArrayList<DepartmentDTO>();
		for (Department department : list) {
			dto.add(new DepartmentDTO(department.getId(), department.getName(), department.getEmail(),
					department.getDeveloupers(), projects));
		}
		return dto;
	}

	List<DeveloperDTO> developerToDeveloper(List<Developer> list) {
		List<DeveloperDTO> dto = new ArrayList<DeveloperDTO>();
		for (Developer developer : list) {
			dto.add(new DeveloperDTO(developer.getId(), developer.getLogin(), developer.getPassword(),
					developer.getEmail(), developer.getFirstName(), developer.getLastName(), developer.getDateOfBirth(),
					developer.getDateOfEmployment(), developer.getDepartment(), developer.getPosition(),
					developer.getPosition(), developer.getSessions()));
		}
		return dto;
	}

	List<SessionDTO> sessionToSession(List<Session> list) {
		List<SessionDTO> dto = new ArrayList<SessionDTO>();
		for (Session session : list) {
			dto.add(new SessionDTO(session.getId(), session.getStartSession(), session.getFinishSession(),
					session.getReport(), session.getResource(), session.getProject(), session.getDeveloper()));
		}
		return dto;
	}

	SessionDTO sessionToSession(Session session) {
return new SessionDTO(, startSession, finishSession, report, resource, project, developer)
	}

}
