package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Uuid;

public interface UuidDao extends JpaRepository<Uuid, Integer> {

}
