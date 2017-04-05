package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.TechnicalSpecificationDao;
import dev.m_pluse.com.dto.ResourceDTO;
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

	public TechnicalSpecification createTechnicalSpecification(ResourceDTO resourceDTO) {

		TechnicalSpecification specification = new TechnicalSpecification();
		specification.setFileSpecification(new Resource(resourceDTO.getName(), resourceDTO.getType(), path));
		save(specification);

		return specification;
	}

}
