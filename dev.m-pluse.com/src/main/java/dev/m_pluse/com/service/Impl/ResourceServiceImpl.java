package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.ResourceDao;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceDao resourceDao;

	public void save(Resource resource) {
		resourceDao.save(resource);

	}

	public List<Resource> findAll() {

		return resourceDao.findAll();
	}

	public Resource findOne(int id) {

		return resourceDao.findOne(id);
	}

	public void delete(int id) {
		resourceDao.delete(id);

	}

}
