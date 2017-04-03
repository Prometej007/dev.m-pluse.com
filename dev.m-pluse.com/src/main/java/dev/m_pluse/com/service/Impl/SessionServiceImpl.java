package dev.m_pluse.com.service.Impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.ProjectDao;
import dev.m_pluse.com.dao.ResourceDao;
import dev.m_pluse.com.dao.SessionDao;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.entity.Session;
import dev.m_pluse.com.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionDao sessionDao;
	@Autowired
	private ResourceDao resourceDao;
	@Autowired
	private ProjectDao projectDao;

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

	/**
	 * 
	 * @return робочу сесію розробників за поточний місяць
	 */
	public List<Session> sessionPerMonth() {
		LocalDateTime date = LocalDateTime.now();
		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (date.getMonth().equals(session.getFinishSession().getMonth())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param developer
	 * @return робочу сесію розробника за поточний місяць
	 */

	public List<Session> sessionPerMonth(Developer developer) {
		LocalDateTime date = LocalDateTime.now();
		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (date.getMonth().equals(session.getFinishSession().getMonth())
					&& developer.equals(session.getDeveloper())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param department
	 * @return робочу сесію розробників з department за поточний місяць
	 */
	public List<Session> sessionPerMonth(Department department) {
		LocalDateTime date = LocalDateTime.now();
		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (date.getMonth().equals(session.getFinishSession().getMonth())
					&& department.equals(session.getDeveloper().getDepartment())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberMonth
	 * @param numbeYear
	 * @return - list сесій розробників за numbeYear і numberMonth
	 */
	public List<Session> sessionPerMonth(int numberMonth, int numbeYear) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getMonthValue() == numberMonth
					&& session.getStartSession().getYear() == numbeYear) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberMonth
	 * @param numbeYear
	 * @param department
	 * @return - list сесій розробників за numbeYear і numberMonth і з відділу
	 */
	public List<Session> sessionPerMonth(int numberMonth, int numbeYear, Department department) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getMonthValue() == numberMonth
					&& session.getStartSession().getYear() == numbeYear
					&& department.equals(session.getDeveloper().getDepartment())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberMonth
	 * @param numberYear
	 * @param developer
	 * @return - list сесій розробника developer за numbeYear і numberMonth
	 */
	public List<Session> sessionPerMonth(int numberMonth, int numberYear, Developer developer) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getMonthValue() == numberMonth
					&& session.getStartSession().getYear() == numberYear && developer.equals(session.getDeveloper())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberYear
	 * @return - list сесій розробника за numbeYear
	 */
	public List<Session> sessionPerYear(int numberYear) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getYear() == numberYear) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberYear
	 * @param department
	 * @return - list сесій розробника за numbeYear з department
	 */
	public List<Session> sessionPerYear(int numberYear, Department department) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getYear() == numberYear
					&& department.equals(session.getDeveloper().getDepartment())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param numberYear
	 * @param developer
	 * @return - list сесій розробника developer за numbeYear
	 */
	public List<Session> sessionPerYear(int numberYear, Developer developer) {

		List<Session> list = new ArrayList<>();
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getYear() == numberYear && developer.equals(session.getDeveloper())) {
				list.add(session);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param developer
	 *            - відкриття деної сесії розробника
	 */
	public void createNewDaySession(Developer developer) {
		Session session = new Session();
		session.setDeveloper(developer);
		session.setStartSession(LocalDateTime.now());
		save(session);
	}

	/**
	 * 
	 * @param developer
	 * @param report
	 *            звіт String закінчення робочої сесії з коментарем string
	 */
	public void finishDaySessionReport(Developer developer, String report) {
		Session saveSession = null;
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getYear() == LocalDateTime.now().getYear()
					&& session.getStartSession().getMonth().equals(LocalDateTime.now().getMonth())
					&& session.getStartSession().getDayOfMonth() == LocalDateTime.now().getDayOfMonth()
					&& developer.equals(session.getDeveloper()) && session.getFinishSession() == null) {
				saveSession = session;
			}
		}
		if (saveSession != null && !report.equals("")) {
			saveSession.setFinishSession(LocalDateTime.now());
			saveSession.setReport(report);
			save(saveSession);
		}

	}

	/**
	 * 
	 * @param developer
	 * @param path
	 *            - посилання на звіт закінчення робочої сесії з звітом в файлі
	 */
	public void finishDaySessionPath(Developer developer, String path) {
		Session saveSession = null;
		for (Session session : sessionDao.findAll()) {
			if (session.getStartSession().getYear() == LocalDateTime.now().getYear()
					&& session.getStartSession().getMonth().equals(LocalDateTime.now().getMonth())
					&& session.getStartSession().getDayOfMonth() == LocalDateTime.now().getDayOfMonth()
					&& developer.equals(session.getDeveloper()) && session.getFinishSession() == null) {
				saveSession = session;
			}
		}
		if (saveSession != null && !path.equals("")) {
			saveSession.setFinishSession(LocalDateTime.now());
			Resource resource = new Resource(
					"report Y: [ " + LocalDateTime.now().getYear() + " ] M: [ " + LocalDateTime.now().getMonth()
							+ " ] D: [ " + LocalDateTime.now().getDayOfMonth() + " ] ",
					ResourceType.SESSION_REPORT, null, path);
			saveSession.setResource(resource);
			save(saveSession);
			resourceDao.save(resource);
		}

	}

	/**
	 * 
	 * @param project
	 * @param developer
	 * @return текстові звіти developer до проекту
	 */
	public List<Resource> sessionReport(Project project, Developer developer) {
		List<Resource> list = new ArrayList<Resource>();

//		for (Session session : sessionDao.findAll()) {
//			if (session.getProject().equals(project) && session.getDeveloper().equals(developer)
//					&& session.getResource().getType().equals(ResourceType.SESSION_REPORT)) {
//				list.add(session.getResource());
//			}
//		}
		return list;
	}

	public int sessionOfficeHours(Developer developer, int month) {
		int hours=0;
		for (Session session : developer.getSessions()) {
			if(session.getStartSession().getMonthValue()==month){
				hours+=session.getFinishSession().getHour()-session.getStartSession().getHour();
			}
		}
		return hours;
	}

}
