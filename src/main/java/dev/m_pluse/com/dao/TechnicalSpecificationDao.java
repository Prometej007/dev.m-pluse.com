package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.TechnicalSpecification;

public interface TechnicalSpecificationDao extends JpaRepository<TechnicalSpecification, Integer> {

}
