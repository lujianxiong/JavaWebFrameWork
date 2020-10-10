package cn.daxiong.dao.impl;

import cn.daxiong.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao{

	@Override
	public void getUser() {
		System.out.println("mysql获取用户数据");
	}

}
