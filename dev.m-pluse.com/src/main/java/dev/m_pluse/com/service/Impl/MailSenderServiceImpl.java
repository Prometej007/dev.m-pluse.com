package dev.m_pluse.com.service.Impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
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

import dev.m_pluse.com.constants.Configuration;
import dev.m_pluse.com.entity.Developer;
import dev.m_pluse.com.service.MailSenderService;

/**
 * @author prometej
 * @version 1.0
 */

@Service
public class MailSenderServiceImpl implements MailSenderService {

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
				return new PasswordAuthentication(Configuration.SITE_EMAIL_LOGIN, Configuration.SITE_EMAIL_PASSWORD);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setFrom(new InternetAddress(Configuration.SITE_EMAIL_LOGIN));

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

	/**
	 * @param Developer
	 *            developer
	 */
	public void inviteDeveloper(Developer developer) {

		try {
			String mailBody = "<a href=" + InetAddress.getLocalHost() + ":" + Configuration.PORT + "/"
					+ Configuration.NAME_PROJECT + "/invite" + "PATHVARIBLE" + "></a>";
			sendMail("invite Developer" + Configuration.NAME_PROJECT, mailBody, developer.getEmail());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	public void changePassword(Developer developer) {
		String theme = "";
		String mailBody;
		try {
			mailBody = "<a href=" + InetAddress.getLocalHost() + ":" + Configuration.PORT + "/"
					+ Configuration.NAME_PROJECT + "/changePassword" + "PATHVARIBLE" + "></a>";
			sendMail(theme, mailBody, developer.getEmail());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

	}

}
