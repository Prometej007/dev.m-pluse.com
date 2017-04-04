package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

}
