package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Task;

public interface TaskDao extends JpaRepository<Task, Integer> {

}
