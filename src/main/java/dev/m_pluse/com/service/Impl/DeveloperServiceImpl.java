package dev.m_pluse.com.service.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.DepartmentDao;
import dev.m_pluse.com.dao.DeveloperDao;
import dev.m_pluse.com.dto.DeveloperRegistrationDTO;
import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.entity.Uuid;
import dev.m_pluse.com.entity.UuidType;
import dev.m_pluse.com.service.DeveloperService;
import dev.m_pluse.com.service.MailSenderService;
import dev.m_pluse.com.service.UuidService;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperDao developerDao;
	@Autowired
	private UuidService uuidService;
	@Autowired
	private MailSenderService mailSenderService;

	@Autowired
	private DepartmentDao departmentDao;

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

	public Developer findOneByUuid(String id, UuidType type) {
		Developer developer = null;
		for (Uuid uuid : uuidService.findAll()) {
			if (uuid.getUuid().equals(id)) {
				developer = uuid.getDeveloper();
			}
		}
		return developer;
	}

	public Developer findOneByEmail(String email) {
		for (Developer developer : developerDao.findAll()) {
			if (developer.getEmail().equals(email)) {
				return developer;
			}

		}
		return null;
	}

	/**
	 * 
	 * @param department
	 * @return ������� ��� ���������� ����� department
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
	public void createDeveloper(String email, Position position, int idDepartment) {
		Developer developer = new Developer();
		developer.setEmail(email);
		developer.setPosition(position);
		developer.setDepartment(departmentDao.findOne(idDepartment));
		developer.setEnabled(false);
		save(developer);
		mailSenderService.inviteDeveloper(developer);
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
	public void registrationDeveloper(DeveloperRegistrationDTO developerDTO) {

		Developer developer = findOneByUuid(developerDTO.getId(), UuidType.REGISTRATION_DEVELOPER);
		developer.setLogin(developerDTO.getLogin());
		developer.setPassword(developerDTO.getPassword());
		developer.setDateOfBirth(developerDTO.getDateOfBirth());
		developer.setFirstName(developerDTO.getFirstName());
		developer.setLastName(developerDTO.getLastName());
		developer.setDateOfEmployment(LocalDate.now());
		developer.setEnabled(true);
		save(developer);
		uuidService.delete(uuidService.findOneByUuid(developerDTO.getId(), UuidType.REGISTRATION_DEVELOPER).getId());
	}

	/**
	 * 
	 * @param email
	 *            ������ �� ���� ������
	 */
	public void changePasswordSend(String email) {

		mailSenderService.changePassword(findOneByEmail(email));
		uuidService.createUuid(findOneByEmail(email), UuidType.CHANGE_PASSWORD);
	}

	/**
	 * @param String
	 *            id
	 * @param String
	 *            password
	 * 
	 */
	public void changePassword(String id, String password) {
		Developer developer = findOneByUuid(id, UuidType.CHANGE_PASSWORD);
		developer.setPassword(password);
		save(developer);
		uuidService.delete(uuidService.findOneByUuid(id, UuidType.CHANGE_PASSWORD).getId());
	}

	/**
	 * @param Developer
	 *            developer
	 * @param Position
	 *            position - updete position
	 */
	public void updatePrositionDeveloper(Developer developer, Position position) {

		developer.setPosition(position);
		save(developer);

	}

	@Override
	public Developer findOneByLogin(String login) {
		for (Developer developer : findAll()) {
			if (developer.getLogin().equals(login)) {

				return developer;
			}
		}
		return null;
	}

}
