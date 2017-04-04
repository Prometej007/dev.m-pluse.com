package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Company;

public interface CompanyService {
	void save(Company company);

	List<Company> findAll();

	Company findOne(int id);

	void delete(int id);

	void createCompany(String street, String name);

	List<>
}
