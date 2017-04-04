package dev.m_pluse.com.dto;

import java.util.ArrayList;
import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;

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
			dto.add(new Company(company.getName(), company.getProject(), customerTo—ustomerDTO(company.getCustomer()),
					company.getStreet()));
		}
		return dto;
	}

}
