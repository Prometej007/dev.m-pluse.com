package dev.m_pluse.com.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Settings;

public interface SettingsService {
	void save(Settings settings);

	List<Settings> findAll();

	Settings findOne(int id);

	void delete(int id);

	public Settings findOneByDeveloper(Developer developer);

	public void changeAvater(Developer developer, String avatar, MultipartFile multipart);

	public void changeBackgroundImage(Developer developer, String backgroundImage, MultipartFile multipartFile);

	public void changeBackgroundColor(Developer developer, String backgroundColor);

	public void changeColor(Developer developer, String color);

	public void changeHref(Developer developer, String href);

	public void changeFontStyle(Developer developer, String fontStyle);

	public void createSettings(Developer developer);

}
