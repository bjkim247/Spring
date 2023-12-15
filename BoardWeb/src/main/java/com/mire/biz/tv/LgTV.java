package com.mire.biz.tv;

import org.springframework.stereotype.Component;

public class LgTV implements TV{
	
	
	
	public LgTV() {
		System.out.println("LgTV �������۵��ؼ� �������");
	}
	public void initMethod() {
		System.out.println("LgTV initmethod");
	}
	@Override
	public void powerOn() {
		System.out.println("LGTV on");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV off");
		
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV speaker up");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV speaker down");
		
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod");
	}
}