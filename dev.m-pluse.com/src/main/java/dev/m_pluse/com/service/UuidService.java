package dev.m_pluse.com.service;

import java.util.List;

import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Uuid;
import dev.m_pluse.com.entity.UuidType;

public interface UuidService {
	void save(Uuid uuid);

	List<Uuid> findAll();

	Uuid findOne(int id);

	void delete(int id);

	public Uuid createUuid(Developer developer, UuidType type);
}
