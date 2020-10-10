package cn.daxiong.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Object target;  //目标对象——真实对象
	
	public void setTarget(Object target) {
		this.target = target;
	}

	//生成代理类
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

	//proxy是代理类
	//method是代理类调用程序处理的方法对象
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log(method.getName());
		Object result = method.invoke(target, args);
		return result;
	}

	public void log(String methodName) {
		System.out.println("执行" + methodName + "方法");
	}
	
//	//看房
//	private void seeHouse() {
//		System.out.println("带房客看房");
//	}
//	//收中介费
//	private void fare() {
//		System.out.println("收取中介费");
//	}

}
