package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Settings;

public interface SettingsService {
	void save(Settings settings);

	List<Settings> findAll();

	Settings findOne(int id);

	void delete(int id);

	public Settings findOneByDeveloper(Developer developer);

	public void changeFont(Developer developer, String font);
}
