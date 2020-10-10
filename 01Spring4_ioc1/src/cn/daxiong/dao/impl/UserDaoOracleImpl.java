package cn.daxiong.dao.impl;

import cn.daxiong.dao.UserDao;

public class UserDaoOracleImpl implements UserDao{

	@Override
	public void getUser() {
		System.out.println("oracle获取用户数据");
	}

}
