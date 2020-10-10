package cn.daxiong.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.daxiong.dao.UserDao;
import cn.daxiong.entity.User;

public class Test {

	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username","xiong");
		List<User> list = userDao.getAll(map);
		for (User user : list) {
			System.out.println(user);
		}
		
	}
}
