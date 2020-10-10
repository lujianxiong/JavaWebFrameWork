package cn.daxiong.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	@Before("execution(* cn.daxiong.service.impl.*.*(..))")
	public void before() {
		System.out.println("--------方法执行前--------");
	}
	@After("execution(* cn.daxiong.service.impl.*.*(..))")
	public void after() {
		System.out.println("--------方法执行后--------");
	}
	@Around("execution(* cn.daxiong.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("环绕前");
		System.out.println("签名："+jp.getSignature());
		// 执行目标方法 
		Object result = jp.proceed();
		System.out.println("环绕后");
		return result;
	}
}
