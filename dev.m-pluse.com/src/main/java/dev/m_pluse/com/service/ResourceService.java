package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Resource;

public interface ResourceService {
	void save(Resource resource);

	List<Resource> findAll();

	Resource findOne(int id);

	void delete(int id);
}
