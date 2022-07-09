package com.carrot.springmvc.app.board.config;

//
//@Configuration
//@MapperScan(basePackages = {"com.carrot.springmvc.app.board.dao"})
//public class SqlMapper {
//
//    @Autowired
//    ApplicationContext applicationContext;
//
//
//    @Bean
//
//    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setConfigLocation(applicationContext.getResource("classpath:/mybatis/sqlMapConfig.xml"));
//        factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mybatis/mapper/*.xml"));
//        return factoryBean;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
