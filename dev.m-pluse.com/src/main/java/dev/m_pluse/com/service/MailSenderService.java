package dev.m_pluse.com.service;

import dev.m_pluse.com.entity.Developer;

/**
 * @author prometej
 * @version 1.0
 */
public interface MailSenderService {

	public void sendMail(String theme, String mailBody, String email);

	public void inviteDeveloper(Developer developer);

}
