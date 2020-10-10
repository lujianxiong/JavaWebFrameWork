package cn.daxiong.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	/**
	 * 通过配置文件创建SqlSessionFactory
	 * SqlSessionFactory是SqlSession的工厂类
	 */
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "MyBatisConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	/**
	 * SqlSession 通过Mapper映射文件中的sql语句的id找到对应的sql语句，执行sql语句
	 */
	public static SqlSession getSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		return sqlSessionFactory.openSession();
	}
	
}
