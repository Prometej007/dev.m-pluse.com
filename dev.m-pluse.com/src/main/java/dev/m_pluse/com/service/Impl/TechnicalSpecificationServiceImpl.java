package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.m_pluse.com.dao.TechnicalSpecificationDao;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.TechnicalSpecification;
import dev.m_pluse.com.service.TechnicalSpecificationService;

public class TechnicalSpecificationServiceImpl implements TechnicalSpecificationService {
	@Autowired
	private TechnicalSpecificationDao technicalSpecificationDao;

	public void save(TechnicalSpecification technicalSpecification) {
		technicalSpecificationDao.save(technicalSpecification);

	}

	public List<TechnicalSpecification> findAll() {

		return technicalSpecificationDao.findAll();
	}

	public TechnicalSpecification findOne(int id) {

		return technicalSpecificationDao.findOne(id);
	}

	public void delete(int id) {
		technicalSpecificationDao.delete(id);

	}

	@Override
	public TechnicalSpecification createTechnicalSpecification(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TechnicalSpecification> selectTechnicalSpecificationFromProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

}
