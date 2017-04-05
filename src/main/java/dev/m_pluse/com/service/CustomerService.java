package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.dto.—ustomerRegistrationDTO;
import dev.m_pluse.com.entity.Customer;

public interface CustomerService {
	void save(Customer customer);

	List<Customer> findAll();

	Customer findOne(int id);

	void delete(int id);

	void add—ustomer(—ustomerRegistrationDTO customerRegistration);

	List<Customer> getAllCustomerWithCompany(int company);

}
