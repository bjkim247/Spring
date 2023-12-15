package com.mire.biz.common;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.mire.biz.user.UserVO;

import oracle.sql.DATE;




@Service
@Aspect
public class AfterReturningAdvice {
	
	
	@AfterReturning(pointcut = "PointCutCommon.getPointcut()", returning = "returnObj")
	public void afterReturnLog(JoinPoint jp,Object returnObj) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		Object obj = jp.getTarget();
		Date date = new Date();
		
		//���ϰ� ������ Ȯ���� �� �ִ�.
		if( returnObj instanceof UserVO ) {
			UserVO userVO = (UserVO)returnObj;
			if(userVO.getRole().equals("Admin")) {
				System.out.println(userVO.getName()+"�����ڴ� ȯ���մϴ�"+date.toString());
			}else {
				System.out.println(userVO.getName()+"�� �湮�Ͽ���"+date.toString());
			}
		}
		
		System.out.println("[afterReturnLog] ����Ͻ� ���� ������ ���� ���� �޼ҵ�"+ methodName + 
				"�Ű�����= " +args[0].toString() +" Ŭ���� ="+obj.toString() );
	}
}