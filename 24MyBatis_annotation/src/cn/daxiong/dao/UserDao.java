package cn.daxiong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.daxiong.entity.User;

public interface UserDao {
	@Select("select * from user")
	public List<User> getList();

}
