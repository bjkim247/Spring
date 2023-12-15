package com.mire.ioc.injection;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext beanFactory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean)beanFactory.getBean("collectionBean");
		Properties p = bean.getProperties();
		Set<Object> set = p.keySet();
		
		for(Object data : set) {
			String _data = (String)data;
			System.out.println(_data);
		}
				
	
	}
		
	}
	


//		setCollectionBean bean = (setCollectionBean) beanFactory.getBean("collectionBean");
//		Set<String> set = bean.getAddressList();
//		mapCollectionBean bean = (mapCollectionBean)beanFactory.getBean("collectionBean");
//		Map<String, String> map = bean.getAddressList();
//		 for (Map.Entry<String, String> entry : map.entrySet()) {
//	            String key = entry.getKey();
//	            String value = entry.getValue();
//	            System.out.println("Key: " + key + ", Value: " + value);
//	        }