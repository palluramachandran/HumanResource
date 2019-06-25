package com.hrms.util;
import java.io.IOException;
import java.io.Reader;
 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 
public class IbatisUtil {
 
    private static SqlSessionFactory sqlSessionFactory;
 
    static {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("ibatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}