package dev.m_pluse.com.service;

import java.time.LocalDate;
import java.util.List;

import dev.m_pluse.com.entity.Department;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.entity.UuidType;

public interface DeveloperService {
	void save(Developer developer);

	List<Developer> findAll();

	Developer findOne(int id);

	void delete(int id);

	public Developer findOneByUuid(String id, UuidType type);

	public Developer findOneByEmail(String email);

	public List<Developer> allDeveloperOfTheDepartment(Department department);

	public List<Developer> allDeveloperOfTheDepartmentWithPosition(Department department, Position position);

	public void createDeveloper(String email, Position position, Department department);

	public void registrationDeveloper(String id, String login, String password, LocalDate dateOfBirth, String firstName,
			String lastName);

	public void updatePrositionDeveloper(Developer developer, Position position);

	public void changePassword(String id, String password);

	public void changePasswordSend(String email);

}
