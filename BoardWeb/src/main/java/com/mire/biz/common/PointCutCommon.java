package com.mire.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutCommon {

	@Pointcut("execution(* com.mire.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.mire.biz..*Impl.get*(..))")
	public void getPointcut() {}
}
