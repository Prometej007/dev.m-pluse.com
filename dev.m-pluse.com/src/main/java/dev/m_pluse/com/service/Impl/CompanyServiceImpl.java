package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.CompanyDao;
import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	public void save(Company company) {
		companyDao.save(company);
	}

	public List<Company> findAll() {

		return companyDao.findAll();
	}

	public Company findOne(int id) {

		return companyDao.findOne(id);
	}

	public void delete(int id) {
		companyDao.delete(id);

	}

	/**
	 * 
	 * @param street
	 * @param name
	 * @param customer
	 *            - list
	 */
	public void createCompany(String street, String name) {
		Company company = new Company();
		company.setCustomer(new ArrayList<Customer>());
		company.setName(name);
		company.setStreet(street);
		save(company);
	}

}
