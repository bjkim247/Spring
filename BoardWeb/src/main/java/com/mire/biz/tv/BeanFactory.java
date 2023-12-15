package com.mire.biz.tv;

//객체관리를 우리가 만든 BeanFactory 담당을 진행했다.
public class BeanFactory {
	public Object getBean(String beanName) {
		Object obj = null;
		switch(beanName) {
		case "samsung": 
			obj = new SamsungTV();
			break;
		case "lg" :
			obj = new LgTV();
			break;
		default: 
			obj = null;
			break;
		}
		return obj;
	}
}
