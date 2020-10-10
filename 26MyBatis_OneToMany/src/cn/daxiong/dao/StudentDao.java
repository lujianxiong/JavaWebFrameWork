package cn.daxiong.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.daxiong.entity.Student;
import cn.daxiong.util.MyBatisUtil;

public class StudentDao {
	public List<Student> getAll() throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<Student> list = session.selectList("cn.daxiong.entity.studentMapper.getStudents");
		session.close();
		return list;
	}
	
}
