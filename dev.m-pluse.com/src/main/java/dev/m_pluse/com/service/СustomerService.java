package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Ñustomer;

public interface ÑustomerService {
	void save(Ñustomer customer);

	List<Ñustomer> findAll();

	Ñustomer findOne(int id);

	void delete(int id);

}
