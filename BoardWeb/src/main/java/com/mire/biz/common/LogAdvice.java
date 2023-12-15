package com.mire.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
//	@Pointcut("execution(* com.mire.biz..*Impl.*(..))")
//	public void allPointcut() {}
//	
//	@Pointcut("execution(* com.mire.biz..*Impl.get*(..))")
//	public void getPointcut() {}

	
	@Before("PointCutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		Object obj = jp.getTarget();
		
		System.out.println("[beforeLog] 비즈니스 로직 수행전 동작 메소드"+ methodName + 
				"매개변수= " +args[0].toString() +" 클래스 ="+obj.toString() );

	}
}
