package com.test.�ն���ģʽ;

//�ڿն���ģʽ��Null Object Pattern���У�һ���ն���ȡ�� NULL ����ʵ���ļ�顣Null �����Ǽ���ֵ�����Ƿ�Ӧһ�������κζ����Ĺ�ϵ�������� Null ����Ҳ���������ݲ����õ�ʱ���ṩĬ�ϵ���Ϊ��
//�ڿն���ģʽ�У����Ǵ���һ��ָ������Ҫִ�еĲ����ĳ��������չ�����ʵ���࣬������һ��δ�Ը������κ�ʵ�ֵĿն����࣬�ÿն����ཫ�޷��ʹ������Ҫ����ֵ�ĵط���

public class NullPatternDemo {
	   public static void main(String[] args) {

	      AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
	      AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
	      AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
	      AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

	      System.out.println("Customers");
	      System.out.println(customer1.getName());
	      System.out.println(customer2.getName());
	      System.out.println(customer3.getName());
	      System.out.println(customer4.getName());
	   }
	}
