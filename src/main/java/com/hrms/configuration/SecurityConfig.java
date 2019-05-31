package com.hrms.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * For configuring users
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
                   .withUser("admin").password("admin").roles("USER");
	}
	
	/**
	 * Handling the security
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	    http.authorizeRequests()
		.antMatchers("/analytics").access("hasRole('ROLE_USER')")
		.antMatchers("/departmentConfiguration").access("hasRole('ROLE_USER')")
		.antMatchers("/addDepartment").access("hasRole('ROLE_USER')")
		.antMatchers("/editDepartment").access("hasRole('ROLE_USER')")
		.antMatchers("/employeeConfiguration").access("hasRole('ROLE_USER')")
		.antMatchers("/addEmployee").access("hasRole('ROLE_USER')")
		.antMatchers("/editEmployee").access("hasRole('ROLE_USER')")
		.and()
		    .formLogin().loginPage("/login").failureUrl("/login?error").defaultSuccessUrl("/analytics")
		    .usernameParameter("username").passwordParameter("password")		
		.and()
		    .logout().logoutSuccessUrl("/login?logout")
		.and()
		    .csrf().disable();	
	}
}