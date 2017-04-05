package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.TechnicalSpecificationDao;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.TechnicalSpecification;
import dev.m_pluse.com.service.TechnicalSpecificationService;

@Service
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

	public TechnicalSpecification createTechnicalSpecification(Resource resource) {

		TechnicalSpecification specification = new TechnicalSpecification();
		specification.setFileSpecification(resource);
		save(specification);

		return findOneByPath(specification.getFileSpecification().getPath());
	}

	@Override
	public TechnicalSpecification findOneByPath(String path) {
		TechnicalSpecification specification = null;
		for (TechnicalSpecification obj : findAll()) {
			if (obj.getFileSpecification().getPath().equals(path)) {
				specification = obj;
			}
		}
		return specification;
	}

}
