package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.�ustomer;

public interface �ustomerService {
	void save(�ustomer customer);

	List<�ustomer> findAll();

	�ustomer findOne(int id);

	void delete(int id);

}
