package cn.daxiong.vo;

public class User {
	private String name;
	
	//有参构造
	public User(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("name = "+name);
	}
}
