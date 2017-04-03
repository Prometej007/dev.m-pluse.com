package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.TechnicalSpecification;

public interface TechnicalSpecificationService {
	void save(TechnicalSpecification technicalSpecification);

	List<TechnicalSpecification> findAll();

	TechnicalSpecification findOne(int id);

	void delete(int id);

	// or
	public TechnicalSpecification createTechnicalSpecification(Project project);

	// or
	public List<TechnicalSpecification> selectTechnicalSpecificationFromProject(Project project);

}
