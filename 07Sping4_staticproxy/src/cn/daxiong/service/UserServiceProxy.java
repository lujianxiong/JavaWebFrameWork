package cn.daxiong.service;

public class UserServiceProxy implements UserService {
	private UserService userService;
	
	public UserServiceProxy() {
		super();
	}
	public UserServiceProxy(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void add() {
		log("add");
		userService.add();
	}

	@Override
	public void update() {
		log("update");
		userService.update();
	}

	@Override
	public void delete() {
		log("delete");
		userService.delete();
	}

	@Override
	public void search() {
		log("search");
		userService.search();
	}
	
	public void log(String methodName) {
		System.out.println("执行"+methodName+"方法");
	}

}
