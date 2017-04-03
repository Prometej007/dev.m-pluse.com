package dev.m_pluse.com.service.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DeveloperDao;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.service.DeveloperService;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperDao developerDao;

	public void save(Developer developer) {
		developerDao.save(developer);
	}

	public List<Developer> findAll() {

		return developerDao.findAll();
	}

	public Developer findOne(int id) {
		return developerDao.findOne(id);
	}

	public void delete(int id) {
		developerDao.delete(id);

	}

	/**
	 * 
	 * @param department
	 * @return повертає всіх працівників відділу department
	 */
	public List<Developer> allDeveloperOfTheDepartment(Department department) {
		List<Developer> list = new ArrayList<Developer>();
		for (Developer developer : developerDao.findAll()) {
			if (developer.getDepartment().equals(department)) {
				list.add(developer);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param department
	 * @param position
	 * @return
	 */
	public List<Developer> allDeveloperOfTheDepartmentWithPosition(Department department, Position position) {
		List<Developer> list = new ArrayList<Developer>();
		for (Developer developer : developerDao.findAll()) {
			if (developer.getDepartment().equals(department) && developer.getPosition().equals(position)) {
				list.add(developer);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param email
	 * @param position
	 * @param department
	 */
	public void createDeveloper(String email, Position position, Department department) {
		Developer developer = new Developer();
		developer.setEmail(email);
		developer.setPosition(position);
		developer.setDepartment(department);
		save(developer);
	}

	/**
	 * 
	 * @param id
	 * @param login
	 * @param password
	 * @param dateOfBirth
	 * @param firstName
	 * @param lastName
	 */
	public void registrationDeveloper(int id, String login, String password, LocalDate dateOfBirth, String firstName,
			String lastName) {
		Developer developer = findOne(id);
		developer.setLogin(login);
		developer.setPassword(password);
		developer.setDateOfBirth(dateOfBirth);
		developer.setFirstName(firstName);
		developer.setLastName(lastName);
		developer.setDateOfEmployment(LocalDate.now());
		save(developer);
	}

}
