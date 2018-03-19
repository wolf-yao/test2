package com.test.����λ��ģʽ;


//����λ��ģʽ��Service Locator Pattern������������ʹ�� JNDI ��ѯ��λ���ַ����ʱ�򡣿��ǵ�Ϊĳ��������� JNDI �Ĵ��ۺܸߣ�����λ��ģʽ��������˻��漼�������״�����ĳ������ʱ������λ���� JNDI �в��ҷ��񣬲�����÷�����󡣵��ٴ�������ͬ�ķ���ʱ������λ���������Ļ����в��ң����������ںܴ�̶������Ӧ�ó�������ܡ��������������ģʽ��ʵ�塣
//����Service�� - ʵ�ʴ�������ķ��񡣶����ַ�������ÿ����� JNDI �������в��ҵ���
//Context / ��ʼ�� Context - JNDI Context ���ж�Ҫ���ҵķ�������á�
//����λ����Service Locator�� - ����λ����ͨ�� JNDI ���Һͻ����������ȡ����ĵ���Ӵ���
//���棨Cache�� - ����洢��������ã��Ա㸴�����ǡ�
//�ͻ��ˣ�Client�� - Client ��ͨ�� ServiceLocator ���÷���Ķ���

public class ServiceLocatorPatternDemo {
	   public static void main(String[] args) {
	      Service service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	      service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();        
	   }
	}
