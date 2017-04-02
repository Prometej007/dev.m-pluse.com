package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Customer;

public interface ÑustomerService {
	void save(Customer customer);

	List<Customer> findAll();

	Customer findOne(int id);

	void delete(int id);

}
