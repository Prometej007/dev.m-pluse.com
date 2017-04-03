package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Project;
import dev.m_pluse.com.entity.Resource;

public interface ResourceService {
	void save(Resource resource);

	List<Resource> findAll();

	Resource findOne(int id);

	void delete(int id);

	public List<Resource> selectAllResourceFromProject(Project project);

	public List<Resource> selectResourceGithubFromProject(Project project);

	public List<Resource> selectAllResourceAudio();

	public List<Resource> selectAllResourceVideo();
}
