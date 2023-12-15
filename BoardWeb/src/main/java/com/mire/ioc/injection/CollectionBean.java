package com.mire.ioc.injection;

import java.util.List;
import java.util.Properties;

public class CollectionBean {
	private List<String> addressList;
	private Properties properties;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
}
