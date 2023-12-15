package com.mire.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext beanFactory = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) beanFactory.getBean("userServiceImpl");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO userVO = userService.getUser(vo);
		if(userVO != null) {
			System.out.println(userVO.getName()+ "환영합니다");
		}else {
			System.out.println("로그인 실패");
		}

		beanFactory.close();
	}
}
