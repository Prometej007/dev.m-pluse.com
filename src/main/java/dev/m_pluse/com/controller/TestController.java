package dev.m_pluse.com.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.m_pluse.com.dto.DeveloperRegistrationDTO;
import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.service.DeveloperService;
import dev.m_pluse.com.service.MailSenderService;

@Controller
public class TestController {
	@Autowired
	DeveloperService developerService;
	@Autowired
	public MailSenderService mailSenderService;

	@RequestMapping({ "/", "home" })
	public String home() {
		return "home";
	}
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "loginpage";
	}
	
	

	@RequestMapping("govno")
	public String govno() {

		System.out.println("krijan govno");
		developerService.createDeveloper("anazariks@gmail.com", Position.ROLE_JUNIOR, 2);

		return "redirect:/";
	}

	@RequestMapping("invite{id}")
	public String invite(@PathVariable String id) {
		developerService.registrationDeveloper(
				new DeveloperRegistrationDTO(id, "1", "govno", LocalDate.now(), "krijan", "loh"));
		
		System.out.println("govno+++++++++++++++++++++++++++++++++++++++++++++++++ [ " + id + " ] ");

		return "redirect:/";
	}

}
