package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.m_pluse.com.dao.CompanyDao;
import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.service.CompanyService;

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

}
