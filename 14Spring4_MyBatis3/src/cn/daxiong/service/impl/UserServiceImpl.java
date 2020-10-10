package cn.daxiong.service.impl;

import java.util.List;

import cn.daxiong.dao.UserMapper;
import cn.daxiong.service.UserService;
import cn.daxiong.vo.User;

public class UserServiceImpl implements UserService {
	private UserMapper userMapper = null;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}

}
