package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Developer;

public interface DeveloperDao extends JpaRepository<Developer, Integer> {
	Developer findByName(String name);
}
