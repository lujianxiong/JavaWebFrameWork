package cn.daxiong.service.impl;

import cn.daxiong.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("---------添加用户数据----------");
	}

	@Override
	public void update() {
		System.out.println("---------删除用户数据---------");
	}
}
