package com.banco.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityFilterConfiguration extends AbstractSecurityWebApplicationInitializer {

    public SpringSecurityFilterConfiguration() {
        super(SecurityConfig.class);
    }
}
