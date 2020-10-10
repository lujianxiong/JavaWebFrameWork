package cn.daxiong.staticproxy;

public class Proxy implements Rent{
	private Host host;  //引用房主的房子来出售
	
	public Proxy() {
		super();
	}
	public Proxy(Host host) {
		super();
		this.host = host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	//中介租房
	public void rent() {
		seeHouse();
		host.rent();
		fare();
	}
	
	//看房
	private void seeHouse() {
		System.out.println("带房客看房");
	}
	//收中介费
	private void fare() {
		System.out.println("收取中介费");
	}
}
