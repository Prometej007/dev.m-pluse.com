package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Project;

public interface ProjectDao extends JpaRepository<Project, Integer> {

}
