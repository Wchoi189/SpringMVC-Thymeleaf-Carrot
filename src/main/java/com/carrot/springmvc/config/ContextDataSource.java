package com.carrot.springmvc.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@EnableTransactionManagement
public class ContextDataSource {
    @Bean
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");

        dataSource.setUrl("jdbc:mariadb://127.0.0.1:3306/interview_assignment_db");

        dataSource.setUsername("user");

        dataSource.setPassword("pass");

        dataSource.setDefaultAutoCommit(false);

        return dataSource;

    }




    /**

     * 트랜잭션 매니저 등록

     * @return

     */

}
