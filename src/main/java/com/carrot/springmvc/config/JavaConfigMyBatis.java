package com.carrot.springmvc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableTransactionManagement
//@MapperScan("com.carrot.springmvc.mapper")
public class JavaConfigMyBatis {
//
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor postProcessor() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        ComboPooledDataSource ds = new ComboPooledDataSource();
//        try {
//            ds.setDriverClass("com.mysql.jdbc.Driver");
//        } catch (PropertyVetoException e) {
//            throw new RuntimeException(e);
//        }
//        ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/interview_assignment_db");
//        ds.setUser("user");
//        ds.setPassword("pass");
//        return ds;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        DataSourceTransactionManager tm = new DataSourceTransactionManager();
//        tm.setDataSource(dataSource());
//        return tm;
//    }
//
//    //SqlSessionFactoryBean 등록. DataSource 주입.
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource());
//        return sqlSessionFactory.getObject();
//    }
//
//    @Bean
//    public BoardDAO BoardDAO() throws Exception {
//        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
//        return sessionTemplate.getMapper(BoardDAO.class);
//    }

//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        Resource[] mapperLocations = new Resource[2];
//        mapperLocations[0] = new ClassPathResource("/mybatis/boardMapperXML.xml");
//        mapperLocations[1] = new ClassPathResource("com.carrot.springmvc.mapper.*");
//
//        factoryBean.setMapperLocations(mapperLocations);
//        factoryBean.setTypeAliases(new Class<?>[] { BoardDTO.class });
//        return factoryBean;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(Objects.requireNonNull(sqlSessionFactory().getObject()));
//    }
//
//    @Bean
//    public BoardDAO boardDAO() throws Exception {
//        return sqlSessionTemplate().getMapper(BoardDAO.class);
//    }

}
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setTypeAliasesPackage("com.carrot.springmvc.app.board.model");
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
//        return sessionFactory;
//    }

