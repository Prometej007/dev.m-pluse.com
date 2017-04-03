package dev.m_pluse.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("govno")
	public String govno() {

		System.out.println("krijan govno");
		developerService.createDeveloper("anazariks@gmail.com", Position.ROLE_JUNIOR, null);
		return "redirect:/";
	}

	@RequestMapping("invite{id}")
	public String invite(@PathVariable String id) {

		System.out.println("govno+++++++++++++++++++++++++++++++++++++++++++++++++ [ "+id+" ] ");

		return "redirect:/";
	}

}
