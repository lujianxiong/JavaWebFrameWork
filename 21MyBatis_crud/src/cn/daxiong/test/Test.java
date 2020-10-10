package cn.daxiong.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.dao.UserDao;
import cn.daxiong.entity.User;
import cn.daxiong.util.MyBatisUtil;

public class Test {

	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
//		System.out.println(userDao.getById(1));
//		User user = userDao.getById(3);
//		user.setPassword("666666");
//		System.out.println(userDao.delete(3));
		
//		User user = new User();
//		user.setUsername("吴宣仪");
//		user.setPassword("521");
//		System.out.println(userDao.add(user));
		
		List<User> list = userDao.getAll();
		for(User user:list) {
			System.out.println(user);
		}
	}

}
