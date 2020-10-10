package cn.daxiong.test;

import java.io.IOException;
import java.util.List;

import cn.daxiong.dao.StudentDao;
import cn.daxiong.dao.TeacherDao;
import cn.daxiong.entity.Student;
import cn.daxiong.entity.Teacher;

public class Test {

	public static void main(String[] args) throws IOException {
		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.getTeacher(1);
		System.out.println(teacher);
	}
}
