package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.dto.CustomerDTO;
import dev.m_pluse.com.dto.—ustomerRegistrationDTO;
import dev.m_pluse.com.entity.Customer;

public interface —ustomerService {
	void save(Customer customer);

	List<Customer> findAll();

	Customer findOne(int id);

	void delete(int id);

	void add—ustomer(—ustomerRegistrationDTO customer);

	CustomerDTO getAllCustomerWithCompany(int company);

}
