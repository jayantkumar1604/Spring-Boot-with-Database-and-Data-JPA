package com.gfg.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import jakarta.persistence.EntityManagerFactory;

@Configuration
// Scan the repositories that is present under com.gfg.jpa
@EnableJpaRepositories(basePackages = {"com.gfg.jpa"})
public class AppConfig {
    @Bean
    // LocalEntityManagerFactoryBean sets up an EntityManagerFactory to work with GeeksDB
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("GeeksDB");
        return factoryBean;
    }

    @Bean
    // Transaction manager for the configured EntityManagerFactory,
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}