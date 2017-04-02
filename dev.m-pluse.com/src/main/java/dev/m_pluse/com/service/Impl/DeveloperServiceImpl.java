package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DeveloperDao;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.service.DeveloperService;
@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperDao developerDao;

	public void save(Developer developer) {
		developerDao.save(developer);
	}

	public List<Developer> findAll() {

		return developerDao.findAll();
	}

	public Developer findOne(int id) {
		return developerDao.findOne(id);
	}

	public void delete(int id) {
		developerDao.delete(id);

	}

}
