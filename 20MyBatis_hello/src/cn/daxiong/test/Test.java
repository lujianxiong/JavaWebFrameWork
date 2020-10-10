package cn.daxiong.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.entity.User;
import cn.daxiong.util.MyBatisUtil;

public class Test {

	public static void main(String[] args) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		User user = session.selectOne("cn.daxiong.entity.UserMapper.selectUser",1);	
		System.out.println("id = "+user.getId()+",name = "+user.getUsername()+",pwd = "+user.getPassword());
		session.close();
	}

}
