package com.github.mabutamail.javatemplate.spring.trash;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan  // (1)Посмотрите на все классы Java в том же пакете
public class MyApplicationContextConfiguration {

//    @Bean
//    public DataSource dataSource() {
//        DataSource dataSource = new MysqlDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("s3cr3t");
//        dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
//        return dataSource;
//    }

    // (2)

    // no more UserDao @Bean method!
}
