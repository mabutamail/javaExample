package com.github.mabutamail.javatemplate.spring;

import com.github.mabutamail.javatemplate.spring.beans.EmployeeManager;
import com.github.mabutamail.javatemplate.spring.beans.EmployeeManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github.mabutamail.javatemplate.spring")
public class AppConfig {
    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManagerImpl();
    }
}