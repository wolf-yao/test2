package com.test.���󹤳�ģʽ;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		 return new MailSender();  
	}

}
