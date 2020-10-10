package cn.daxiong.factory;
//静态工厂
import cn.daxiong.vo.User;

public class UserFactory {
	//有个static修饰方法
	public static User newInstance(String name) {
		return new User(name);
	}
	
}
