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
		List<User> list = userDao.getAll(1, 3);
		for(User u:list) {
			System.out.println(u);
		}
	}
}
