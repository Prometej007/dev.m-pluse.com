package dev.m_pluse.com.service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.dao.UuidDao;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.entity.Uuid;
import dev.m_pluse.com.service.UuidService;

@Service
public class UuidServiceImpl implements UuidService {
	@Autowired
	private UuidDao uuidDao;

	@Override
	public void save(Uuid uuid) {
		uuidDao.save(uuid);
	}

	@Override
	public List<Uuid> findAll() {

		return uuidDao.findAll();
	}

	@Override
	public Uuid findOne(int id) {

		return findOne(id);
	}

	@Override
	public void delete(int id) {
		uuidDao.delete(id);

	}

	public Uuid findOneByUuid(String id) {
		for (Uuid uuid : findAll()) {
			if (uuid.getUuid().equals(id)) {
				return uuid;
			}

		}
		return null;

	}

	/**
	 * @param Developer
	 *            developer
	 */
	public Uuid createUuid(Developer developer) {
		String uuid = UUID.randomUUID().toString();
		Uuid uuidObject = new Uuid(uuid, developer);
		uuidDao.save(uuidObject);
		return uuidObject;
	}

}
