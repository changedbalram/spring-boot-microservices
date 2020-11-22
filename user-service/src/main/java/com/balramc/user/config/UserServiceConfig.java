package com.balramc.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author balram
 *
 */
@Configuration
public class UserServiceConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
