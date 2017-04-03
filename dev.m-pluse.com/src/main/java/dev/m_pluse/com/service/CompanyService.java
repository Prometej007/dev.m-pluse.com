package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;

public interface CompanyService {
	void save(Company company);

	List<Company> findAll();

	Company findOne(int id);

	void delete(int id);

	public void createCompany(String street, String name, List<Customer> customer);
}
