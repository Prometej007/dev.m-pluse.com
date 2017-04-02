package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.�ustomerDao;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.service.�ustomerService;

@Service
public class �ustomerServiceImpl implements �ustomerService {
	@Autowired
	private �ustomerDao customerDao;

	public void save(Customer customer) {
		customerDao.save(customer);

	}

	public List<Customer> findAll() {

		return customerDao.findAll();
	}

	public Customer findOne(int id) {

		return customerDao.findOne(id);
	}

	public void delete(int id) {
		customerDao.delete(id);

	}

}
