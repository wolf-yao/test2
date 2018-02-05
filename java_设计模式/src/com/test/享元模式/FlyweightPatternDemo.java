package com.test.��Ԫģʽ;


//��ͼ�����ù�������Ч��֧�ִ���ϸ���ȵĶ���
//��Ҫ��������д�������ʱ���п��ܻ�����ڴ���������ǰ����й�ͬ�Ĳ��ֳ���������������ͬ��ҵ������ֱ�ӷ������ڴ������еĶ��󣬱������´�����
//��ʱʹ�ã� 1��ϵͳ���д������� 2����Щ�������Ĵ����ڴ档 3����Щ�����״̬�󲿷ֿ����ⲿ���� 4����Щ������԰�������״̬��Ϊ�ܶ��飬�������̶���Ӷ������޳�����ʱ��ÿһ����󶼿�����һ�����������档 5��ϵͳ����������Щ������ݣ���Щ�����ǲ��ɷֱ�ġ�
//��ν������Ψһ��ʶ���жϣ�������ڴ����У��򷵻����Ψһ��ʶ������ʶ�Ķ���
//�ؼ����룺�� HashMap �洢��Щ����
//Ӧ��ʵ���� 1��JAVA �е� String��������򷵻أ����û���򴴽�һ���ַ����������ַ�����������档 2�����ݿ�����ݳء�
//�ŵ㣺�����ٶ���Ĵ���������ϵͳ���ڴ棬ʹЧ����ߡ�
//ȱ�㣺�����ϵͳ�ĸ��Ӷȣ���Ҫ������ⲿ״̬���ڲ�״̬�������ⲿ״̬���й��л������ʣ���Ӧ�������ڲ�״̬�ı仯���仯����������ϵͳ�Ļ��ҡ�
//ʹ�ó����� 1��ϵͳ�д������ƶ��� 2����Ҫ����صĳ�����
//ע����� 1��ע�⻮���ⲿ״̬���ڲ�״̬��������ܻ������̰߳�ȫ���⡣ 2����Щ�������һ������������Կ��ơ�

public class FlyweightPatternDemo {
	   private static final String colors[] = 
	      { "Red", "Green", "Blue", "White", "Black" };
	   public static void main(String[] args) {

	      for(int i=0; i < 20; ++i) {
	         Circle circle = 
	            (Circle)ShapeFactory.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
	}
