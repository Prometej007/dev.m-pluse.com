package dev.m_pluse.com.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.m_pluse.com.dao.ResourceDao;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceDao resourceDao;

	public void save(Resource resource) {
		resourceDao.save(resource);

	}

	public List<Resource> findAll() {

		return resourceDao.findAll();
	}

	public Resource findOne(int id) {

		return resourceDao.findOne(id);
	}

	public void delete(int id) {
		resourceDao.delete(id);

	}

	/**
	 * 
	 * @param project
	 * @return всі ресурси до проекту project
	 */
	public List<Resource> selectAllResourceFromProject(Project project) {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getProject().equals(project)) {
				list.add(resource);
			}
		}
		return list;
	}

	/**
	 * 
	 * @param project
	 * @return github силку до проекту project
	 */
	public List<Resource> selectResourceGithubFromProject(Project project) {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.equals(project.getResource())
					&& resource.getType().equals(ResourceType.PROJECT_RESOURCE_GITHUB)) {
				list.add(resource);
			}
		}

		return list;
	}

	/**
	 * 
	 * @return всі аудіо файли DEVELOPER_AUDIO які незакріпленні за проектом
	 */
	public List<Resource> selectAllResourceAudio() {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getType().equals(ResourceType.DEVELOPER_AUDIO) && resource.getProject() == null) {
				list.add(resource);
			}
		}
		return list;
	}

	/**
	 * 
	 * @return всі відео файли DEVELOPER_AUDIO які незакріпленні за проектом
	 */
	public List<Resource> selectAllResourceVideo() {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getType().equals(ResourceType.DEVELOPER_VIDOE) && resource.getProject() == null) {
				list.add(resource);
			}
		}
		return list;
	}

	@Override
	public List<Resource> selectAllResourceImg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFileResource(MultipartFile file, String name) {
		
		
		
	}

	@Override
	public void addFileResource(MultipartFile file, String name, Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Resource> searchFileByResourceType(ResourceType resourceType) {
		// TODO Auto-generated method stub
		return null;
	}

}
