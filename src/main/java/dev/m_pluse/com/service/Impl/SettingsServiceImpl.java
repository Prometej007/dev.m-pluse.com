package dev.m_pluse.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

}
