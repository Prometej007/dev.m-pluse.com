package dev.m_pluse.com.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;
import dev.m_pluse.com.entity.ResourceType;

public interface ResourceService {
	void save(Resource resource);

	List<Resource> findAll();

	Resource findOne(int id);

	void delete(int id);

	public List<Resource> selectAllResourceFromProject(Project project);

	public List<Resource> selectResourceGithubFromProject(Project project);

	public List<Resource> selectAllResourceAudio();

	public List<Resource> selectAllResourceVideo();

	public List<Resource> selectAllDevResourceImg();

	public List<Resource> selectAllProjectResourceImg();
	
	public void addFileResource(MultipartFile multipartFile, String name, ResourceType type);
	
	public void addFileResource(MultipartFile multipartFile, String name, ResourceType type,Project project);

	public List<Resource> searchFileByResourceType(ResourceType resourceType);

}
