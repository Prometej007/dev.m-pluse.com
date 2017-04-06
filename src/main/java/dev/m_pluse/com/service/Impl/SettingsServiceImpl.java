package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.m_pluse.com.constants.Configuration;
import dev.m_pluse.com.dao.SettingsDao;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.entity.Settings;
import dev.m_pluse.com.service.DeveloperService;
import dev.m_pluse.com.service.ResourceService;
import dev.m_pluse.com.service.SettingsService;

@Service
public class SettingsServiceImpl implements SettingsService {
	@Autowired
	private SettingsDao settingsDao;
	@Autowired
	private DeveloperService developerService;
	@Autowired
	private ResourceService resourceService;

	public void save(Settings settings) {
		settingsDao.save(settings);
	}

	public List<Settings> findAll() {

		return settingsDao.findAll();
	}

	public Settings findOne(int id) {

		return settingsDao.findOne(id);
	}

	public void delete(int id) {
		delete(id);
	}

	public Settings findOneByDeveloper(Developer developer) {
		for (Settings obj : findAll()) {
			if (obj.getDeveloper().equals(developer)) {
				return obj;
			}
		}
		return null;
	}

	public void changeFont(Developer developer, String font) {
		Settings settings = findOneByDeveloper(developer);
		settings.setFontStyle(font);
		save(settings);
	}

	public void changeAvater(Developer developer, String avatar, MultipartFile multipart) {
		Settings settings = findOneByDeveloper(developer);
		Resource resource = resourceService.addFileResourceAvatar(multipart, developer.getName(),
				ResourceType.DEVELOPER_AVATAR);

		settings.setAvatar(resource);
		save(settings);
	}

	@Override
	public void changeBackgroundImage(Developer developer, String backgroundImage, MultipartFile multipartFile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeBackgroundColor(Developer developer, String backgroundColor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeColor(Developer developer, String color) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeHref(Developer developer, String href) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeFontStyle(Developer developer, String fontStyle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createSettings(Developer developer) {
		Settings settings = new Settings();
		settings.setAvatar(
				new Resource(developer.getName(), ResourceType.DEVELOPER_AVATAR, Configuration.DEVELOPER_AVATAT));
		settings.setBackgroundColor(Configuration.DEVELOPER_BACKGROUNDCOLOR);
		settings.setBackgroundImage(Configuration.DEVELOPER_BACKGROUNDIMAGE);
		settings.setColor(Configuration.DEVELOPER_COLOR);
		settings.setDeveloper(developer);
		settings.setHref(Configuration.DEVELOPER_HREF);

	}

}
