package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.TechnicalSpecification;

public interface TechnicalSpecificationService {
	void save(TechnicalSpecification technicalSpecification);

	List<TechnicalSpecification> findAll();

	TechnicalSpecification findOne(int id);

	TechnicalSpecification findOneByPath(String path);

	void delete(int id);

	public TechnicalSpecification createTechnicalSpecification(Resource resource);

}
