package com.test.���󹤳�ģʽ;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();  
	}

}
