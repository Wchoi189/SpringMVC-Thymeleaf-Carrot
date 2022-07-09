package com.carrot.springmvc.app.board.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@Configuration
@EnableTransactionManagement
public class ContextDataSource {

    @Bean("data")
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
