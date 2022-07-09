package com.carrot.springmvc.app.board.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil{
    private static SqlSessionFactory sessionFactory;
    static{
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("resources/mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory () {
        return sessionFactory;
    }
}
