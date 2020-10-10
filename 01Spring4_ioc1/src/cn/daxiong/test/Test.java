package cn.daxiong.test;

import cn.daxiong.dao.impl.UserDaoMysqlImpl;
import cn.daxiong.dao.impl.UserDaoOracleImpl;
import cn.daxiong.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoMysqlImpl());
		userService.getUser();
		System.out.println("-----------------------");
		userService.setUserDao(new UserDaoOracleImpl());
		userService.getUser();

	}

}
