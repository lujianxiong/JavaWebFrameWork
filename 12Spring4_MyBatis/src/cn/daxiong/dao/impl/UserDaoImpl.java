package cn.daxiong.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.daxiong.dao.UserDao;
import cn.daxiong.vo.User;

public class UserDaoImpl implements UserDao {
	//SqlSessionTemplate类 相当于是SqlSession的封装，sqlSession有的方法它都有，他是Spring和myBatis整合的包里的。
	//之前我们的sqlSession是通过我们自己写的MyBatisUtil类自己创建的，现在交给Spring来管理。
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<User> selectAll() {
		User user = new User();
		user.setUsername("白敬亭");
		user.setPassword("nizhentamashua");
		sqlSession.insert("cn.daxiong.vo.UserMapper.add",user);
		sqlSession.delete("cn.daxiong.vo.UserMapper.remove",10);
		return sqlSession.selectList("cn.daxiong.vo.UserMapper.selectAll");
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
