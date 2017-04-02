package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.m_pluse.com.dao.SessionDao;
import dev.m_pluse.com.entity.Session;
import dev.m_pluse.com.service.SessionService;

public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionDao sessionDao;

	public void save(Session session) {
		sessionDao.save(session);

	}

	public List<Session> findAll() {

		return sessionDao.findAll();
	}

	public Session findOne(int id) {

		return sessionDao.findOne(id);
	}

	public void delete(int id) {
		sessionDao.delete(id);
	}

}
