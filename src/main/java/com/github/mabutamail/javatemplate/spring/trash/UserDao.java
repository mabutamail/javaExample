package com.github.mabutamail.javatemplate.spring.trash;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    private DataSource dataSource;

    private UserDao(@Autowired DataSource dataSource) {
        this.dataSource = dataSource;
    }
}