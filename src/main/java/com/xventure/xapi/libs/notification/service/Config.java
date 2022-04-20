package com.xventure.xapi.libs.notification.service;

import com.xventure.xapi.libs.mongosearch.factory.XAPIMongoDBRepositoryFactoryBean;
import com.xventure.xapi.libs.notification.repositories.TestCollectionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(repositoryFactoryBeanClass = XAPIMongoDBRepositoryFactoryBean.class, basePackageClasses = TestCollectionRepository.class)
public class Config {

}
