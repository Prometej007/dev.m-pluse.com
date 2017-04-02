package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Session;

public interface SessionService {

	void save(Session session);

	List<Session> findAll();

	Session findOne(int id);

	void delete(int id);

}
