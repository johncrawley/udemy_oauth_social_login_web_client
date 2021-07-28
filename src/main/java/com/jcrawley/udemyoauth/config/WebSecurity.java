package com.jcrawley.udemyoauth.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.anyRequest().authenticated()
		.and().oauth2Login();
	}
}
