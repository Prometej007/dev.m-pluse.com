package dev.m_pluse.com.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.m_pluse.com.service.DeveloperService;

@Service("userDetailsService")
public class DeveloperDetailsServiceIImpl implements UserDetailsService {
	@Autowired
	private DeveloperService developerService;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

		return developerService.findOneByLogin(login);
	}

}
