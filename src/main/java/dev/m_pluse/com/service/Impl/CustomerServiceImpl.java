package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.CompanyDao;
import dev.m_pluse.com.dao.CustomerDao;
import dev.m_pluse.com.dto.CustomerDTO;
import dev.m_pluse.com.dto.CustomerRegistrationDTO;
import dev.m_pluse.com.entity.Company;
import dev.m_pluse.com.entity.Customer;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CompanyDao companyDao;

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

	
	public void addCustomer(CustomerRegistrationDTO customerRegistration) {
		Customer customer =new Customer();
		customer.setFirstName(customerRegistration.getFirstName());
		customer.setLastName(customerRegistration.getLastName());
		customer.setPhoneNumber(customerRegistration.getPhoneNumber());
		customer.setCompany(companyDao.findOne(customerRegistration.getCompany()));
		customer.setPosition(customerRegistration.getPosition());
		save(customer);
		
	}

	
	public List<Customer> getAllCustomerWithCompany(int company) {
		List<Customer> list = new ArrayList<>();
		for (Customer customer : customerDao.findAll()){
			if(customer.getCompany().getId()==company){
				list.add(customer);
			}
		}
		return list;
	}

	
	

}
