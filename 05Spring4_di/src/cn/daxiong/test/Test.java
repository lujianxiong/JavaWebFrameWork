package cn.daxiong.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.daxiong.vo.Student;
import cn.daxiong.vo.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Student stu = (Student)ac.getBean("student");
		User user = (User)ac.getBean("u1");
//		stu.show();
		System.out.println(user);
	}
	
}
