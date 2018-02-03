package com.test.工厂模式;

public class SendFactory_D {

	
	public static  Sender Mailproduce(){
		return new MailSender();
	}
	
	public static  Sender Smsproduce(){
		return new SmsSender();
	}
	
	
}
