package cn.daxiong.service.impl;

import cn.daxiong.dao.UserDao;
import cn.daxiong.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao = null;  //在实例化UserService的时候，创建userDao对象但并不赋值
	
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}


//	public void setUserDao(UserDao userDao) {  //通过setUserDao方法来在测试的时候选择使用哪个UserDao接口的实现类
//		this.userDao = userDao;
//	}

	@Override
	public void getUser() {
		userDao.getUser();
	}
}
