package com.dck.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//boot --> spring  applicationContext.xml  --- @configuration
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
		}
}
