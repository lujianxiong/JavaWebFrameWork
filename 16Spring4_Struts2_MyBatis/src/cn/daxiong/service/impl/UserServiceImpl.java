package cn.daxiong.service.impl;

import java.util.List;

import cn.daxiong.dao.UserDao;
import cn.daxiong.service.UserService;
import cn.daxiong.vo.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	
}
