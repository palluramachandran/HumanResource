package com.hrms.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {

	/**
	 * For loading security config
	 */
	public SpringSecurityInitializer() {
        super(SecurityConfig.class);
    }
	
}
