package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Developer;

public interface DeveloperService {
	void save(Developer developer);

	List<Developer> findAll();

	Developer findOne(int id);

	void delete(int id);
}
