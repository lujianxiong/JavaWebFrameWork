package cn.daxiong.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.entity.User;
import cn.daxiong.util.MyBatisUtil;

public class UserDao {
	public User getById(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		User user = session.selectOne("cn.daxiong.entity.UserMapper.selectUser", id);
		session.close();
		return user;
	}
	
	public int add(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.insert("cn.daxiong.entity.UserMapper.addUser", user);
		session.commit();
		session.close();
		return result;
	}
	
	public int update(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.update("cn.daxiong.entity.UserMapper.updateUser", user);
		session.commit();
		session.close();
		return result;
	}
	
	public int delete(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.delete("cn.daxiong.entity.UserMapper.deleteUser", id);
		session.commit();
		session.close();
		return result;
	}
	
	public List<User> getAll() throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<User> list = session.selectList("cn.daxiong.entity.UserMapper.selectAll");
		session.close();
		return list;
	}
	
}
