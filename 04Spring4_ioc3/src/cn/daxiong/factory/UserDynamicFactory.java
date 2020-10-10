package cn.daxiong.factory;
//动态工厂
import cn.daxiong.vo.User;

public class UserDynamicFactory {
	//相比静态工厂，去掉了static
	public User newInstance(String name) {
		return new User(name);
	}
}
