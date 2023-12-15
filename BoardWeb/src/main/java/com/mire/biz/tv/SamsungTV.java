package com.mire.biz.tv;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class SamsungTV extends Object implements TV {
	//�������
	@Autowired
	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("samsungTv �����ڰ�ü�������");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV on price="+ price);
	}
	public void powerOff() {
		System.out.println("SamsungTV off price="+ price);
	}
	public void volumeUp() {
//		System.out.println("SamsungTV volume on");
		this.speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("SamsungTV volume down");
		this.speaker.volumeDown();
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("setSpeaker ȣ��");
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice ȣ��");
	}
	
}
