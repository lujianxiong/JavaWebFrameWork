package cn.daxiong.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.entity.Teacher;
import cn.daxiong.util.MyBatisUtil;

public class TeacherDao {
	public Teacher getTeacher(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		Teacher teacher = session.selectOne("cn.daxiong.entity.teacherMapper.getTeacher",id);
		session.close();
		return teacher;
	}
	
}
