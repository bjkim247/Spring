package com.mire.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	

	
	@AfterThrowing(pointcut = "PointCutCommon.allPointcut()", throwing = "exception")
	public void afterThrowingLog(JoinPoint jp,Exception exception) {
		String methodName = jp.getSignature().getName();
		
		if(exception instanceof NumberFormatException) {
			System.out.println("[afterThrowingLog] ����Ͻ� ���� ���� �� ����ó�� ���� �Լ���:"
					+ methodName +"NumberFormatException");
		}else if(exception instanceof IllegalArgumentException) {
			System.out.println("[afterThrowingLog] ����Ͻ� ���� ���� �� ����ó�� ���� �Լ���:"
					+ methodName +"IllegalArgumentException");
		}else if(exception instanceof Exception) {
			System.out.println("[afterThrowingLog] ����Ͻ� ���� ���� �� ����ó�� ���� �Լ���:"
					+ methodName +"Exception");
		}else {
			System.out.println("[afterThrowingLog] ����Ͻ� ���� ���� �� ����ó�� ���� �Լ���:"
					+ methodName +"�ż��ϰ� ����ٶ�");
		}
		

	}
}
