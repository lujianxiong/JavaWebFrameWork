package cn.daxiong.service;

public class Test {
	public static void main(String[] args) {
		UserService userService = new UserServiceProxy(new UserServiceImpl());
		userService.add();
		userService.search();
		userService.delete();
	}

}
