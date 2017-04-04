package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Session;

public interface SessionDao extends JpaRepository<Session, Integer> {

}
