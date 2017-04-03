package dev.m_pluse.com.service.Impl;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.constants.Ñonfiguration;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.service.MailSenderService;

/**
 * @author prometej
 * @version 1.0
 */

@Service
public class MailSenderServiceImpl implements MailSenderService {

	// private final static String USERNAME = "anazariks@gmail.com";// mail
	// private final static String PASSWORD = "yfpfh1998";// password

	/**
	 * mailsender what more do u want to know? MimeMessageHelper - html page in
	 * message
	 */
	@Async
	public void sendMail(String theme, String mailBody, String email) {
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.socketFactory.port", "465");
		properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Ñonfiguration.SITE_EMAIL_LOGIN, Ñonfiguration.SITE_EMAIL_PASSWORD);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setFrom(new InternetAddress(Ñonfiguration.SITE_EMAIL_LOGIN));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			helper.setSubject(theme);
			helper.setText(mailBody, true);

			synchronized (this) {
				Transport.send(message);
			}
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

	@Override
	public void inviteDeveloper(Developer developer) {

		String mailBody = "";
		sendMail("invite Developer" + Ñonfiguration.SITE_NAME, mailBody, developer.getEmail());
	}

}
