package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.�ustomerDao;
import dev.m_pluse.com.entity.�ustomer;
import dev.m_pluse.com.service.�ustomerService;

@Service
public class �ustomerServiceImpl implements �ustomerService {
	@Autowired
	private �ustomerDao customerDao;

	public void save(�ustomer customer) {
		customerDao.save(customer);

	}

	public List<�ustomer> findAll() {

		return customerDao.findAll();
	}

	public �ustomer findOne(int id) {

		return customerDao.findOne(id);
	}

	public void delete(int id) {
		customerDao.delete(id);

	}

}
