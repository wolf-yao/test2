package com.test.����ģʽ;

public class SendFactory_D {

	
	public static  Sender Mailproduce(){
		return new MailSender();
	}
	
	public static  Sender Smsproduce(){
		return new SmsSender();
	}
	
	
}
