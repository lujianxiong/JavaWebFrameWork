package cn.daxiong.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.daxiong.dao.UserDao;
import cn.daxiong.vo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public List<User> getAll() {
		return getSqlSession().selectList("cn.daxiong.vo.UserMapper.getAll");
	}

}
