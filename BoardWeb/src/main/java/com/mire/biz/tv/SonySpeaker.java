package com.mire.biz.tv;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("SonySpeaker() ��ü����");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker() volumeUp()");
		
		
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker() volumeDown()");

		
	}
	
}
