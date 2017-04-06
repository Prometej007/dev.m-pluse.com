
package dev.m_pluse.com.service.Impl;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dev.m_pluse.com.constants.Configuration;
import dev.m_pluse.com.dao.ResourceDao;
import dev.m_pluse.com.dto.DtoUtilMapper;
import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;
import dev.m_pluse.com.service.ResourceService;
import dev.m_pluse.resource.wrapper.StringModification;

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

	public List<Resource> selectAllDevResourceImg() {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getType().equals(ResourceType.DEVELOPER_IMG)
					&& resource.getProject().getDepartment().getDeveloupers() != null) {
				list.add(resource);
			}
		}

		return list;
	}

	public List<Resource> selectAllProjectResourceImg() {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getType().equals(ResourceType.DEVELOPER_IMG) && resource.getProject() != null) {
				list.add(resource);
			}
		}
		return list;
	}

	public void addFileResource(MultipartFile multipartFile, String name, ResourceType type) {
		Resource resource = null;

		String uuid = UUID.randomUUID().toString();

		try {
			resource = new Resource(name, type,
					new StringModification().overrideString(InetAddress.getLocalHost() + ":" + Configuration.PORT + "/"
							+ Configuration.NAME_PROJECT + "/" + "resources/all/" + type.name() + "/" + name + "/"
							+ uuid + "/" + multipartFile.getOriginalFilename()));
		} catch (UnknownHostException e1) {

			e1.printStackTrace();
		}

		save(resource);
		String path = System.getProperty("catalina.home") + "/resources/" + name + "/" + uuid + "/"
				+ multipartFile.getOriginalFilename();

		File file = new File(path);

		try {
			file.mkdirs();

			multipartFile.transferTo(file);
		} catch (IOException e) {
			System.out.println("error with file");
		}

	}

	public List<Resource> searchFileByResourceType(ResourceType resourceType) {
		List<Resource> list = new ArrayList<Resource>();
		for (Resource resource : resourceDao.findAll()) {
			if (resource.getType().equals(resourceType)) {
				list.add(resource);
			}
		}
		return list;
	}

	public void addFileResource(MultipartFile multipartFile, String name, ResourceType type, Project project) {
		Resource resource = null;

		String uuid = UUID.randomUUID().toString();

		try {
			resource = new Resource(name, type, project,
					new StringModification().overrideString(InetAddress.getLocalHost() + ":" + Configuration.PORT + "/"
							+ Configuration.NAME_PROJECT + "/" + "resources/" + project.getName() + "/" + type.name()
							+ "/" + name + "/" + uuid + "/" + multipartFile.getOriginalFilename()));
		} catch (UnknownHostException e1) {

			e1.printStackTrace();
		}

		save(resource);
		String path = System.getProperty("catalina.home") + "/resources/" + project.getName() + "/" + name + "/" + uuid
				+ "/" + multipartFile.getOriginalFilename();

		File file = new File(path);

		try {
			file.mkdirs();

			multipartFile.transferTo(file);
		} catch (IOException e) {
			System.out.println("error with file");
		}

	}

	public List<String> resourceTypeToString() {

		List<String> strings = new ArrayList<>();
		for (ResourceType resourceType : ResourceType.values()) {
			strings.add(DtoUtilMapper.resourceType(resourceType));
		}

		return strings;

	}

}
