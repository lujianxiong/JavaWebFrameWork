package cn.daxiong.dynamicproxy;

import java.util.ArrayList;
import java.util.List;

import cn.daxiong.service.UserService;
import cn.daxiong.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
//		UserService userService = new UserServiceImpl();
//		ProxyInvocationHandler pih = new ProxyInvocationHandler();
//		pih.setTarget(userService);
//		UserService proxy = (UserService)pih.getProxy();
//		proxy.delete();
		
		ProxyInvocationHandler ph = new ProxyInvocationHandler();
		ph.setTarget(new ArrayList());
		List list = (List)ph.getProxy();
		list.remove("Daxiong,hello！");
	}
}
