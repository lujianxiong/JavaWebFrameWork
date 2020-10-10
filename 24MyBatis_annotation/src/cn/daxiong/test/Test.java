package cn.daxiong.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.dao.UserDao;
import cn.daxiong.entity.User;
import cn.daxiong.util.MyBatisUtil;

public class Test {

	public static void main(String[] args) throws IOException {
		SqlSession session  = MyBatisUtil.getSession();
		UserDao userDao = session.getMapper(UserDao.class);
		List<User> list = userDao.getList();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
