package com.carrot.springmvc.app.board.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
//@EnableTransactionManagement
//@MapperScan = NOT WORKING. MAPPER WORKING WITH XML ONLY. *BUG
@MapperScan(basePackages = {"com.carrot.springmvc.app.board.mapper"})
public class JavaConfigMyBatis {
    private static final Logger log = LogManager.getLogger(JavaConfigMyBatis.class);
    @Autowired
    private final ApplicationContext applicationContext;

    public JavaConfigMyBatis(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean(name = "firstDataSource")
    public DataSource dataSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
        ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/interview_assignment_db");
        ds.setUser("user");
        ds.setPassword("pass");
        return ds;
    }

//    SqlSessionFactory + Mapper location
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
//        final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setConfigLocation(applicationContext.getResource("src/main/resources/mybatis/application-context.xml"));
//        factoryBean.setMapperLocations(applicationContext.getBean("boardMapper","com.carrot.springmvc.app.board.mapper.BoardMapperJava.class");
//        return factoryBean.getObject();
//    }
}

