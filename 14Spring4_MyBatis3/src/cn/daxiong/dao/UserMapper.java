package cn.daxiong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.daxiong.vo.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> selectAll();
}
