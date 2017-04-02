package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
