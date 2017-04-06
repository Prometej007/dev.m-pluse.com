package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.m_pluse.com.entity.Session;

@Repository
public interface SessionDao extends JpaRepository<Session, Integer> {

}
