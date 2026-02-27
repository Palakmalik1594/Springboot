package com.spring;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring")
public class ProjectConfiguration {
	//@Bean
	//@PostConstruct
//	public EntityManager getEntityManager() {
//		return Persistence
//				.createEntityManagerFactory("postgres")
//				.createEntityManager();
//	}

	
}
