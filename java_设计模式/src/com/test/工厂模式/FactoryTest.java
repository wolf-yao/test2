package com.test.工厂模式;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory fs=new SendFactory();
		Sender sender = fs.produce("sms");  
        sender.Sender();
        SendFactory_D fs_d=new SendFactory_D();
        Sender  sender_d=fs_d.Mailproduce();
        sender_d.Sender();
	}

}
