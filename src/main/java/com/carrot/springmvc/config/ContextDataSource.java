package com.carrot.springmvc.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@EnableTransactionManagement
public class ContextDataSource {
    @Bean
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/interview_assignment_db");

        dataSource.setUsername("user");

        dataSource.setPassword("pass");

        dataSource.setDefaultAutoCommit(false);

        return dataSource;

    }

}
