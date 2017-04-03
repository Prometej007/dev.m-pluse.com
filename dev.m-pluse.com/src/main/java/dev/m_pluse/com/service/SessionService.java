package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.Session;

public interface SessionService {

	void save(Session session);

	List<Session> findAll();

	Session findOne(int id);

	void delete(int id);

	public List<Session> sessionPerMonth();

	public List<Session> sessionPerMonth(Developer developer);

	public List<Session> sessionPerMonth(Department department);

	public List<Session> sessionPerMonth(int numberMonth, int numbeYear);

	public List<Session> sessionPerMonth(int numberMonth, int numbeYear, Department department);

	public List<Session> sessionPerMonth(int numberMonth, int numberYear, Developer developer);

	public List<Session> sessionPerYear(int numberYear, Department department);

	public List<Session> sessionPerYear(int numberYear, Developer developer);

	public void createNewDaySession(Developer developer);

	public void finishDaySessionReport(Developer developer, String report);

	public void finishDaySessionPath(Developer developer, String path);

	public List<Resource> sessionReport(Project project, Developer developer);

	// or
	public int sessionOfficeHours(Developer developer, int month);

}
