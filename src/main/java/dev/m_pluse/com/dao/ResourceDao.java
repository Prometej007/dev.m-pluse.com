package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Resource;

public interface ResourceDao extends JpaRepository<Resource, Integer> {

}
