package com.test.���ģʽ;



//��ͼ����������ϳ����νṹ�Ա�ʾ"����-����"�Ĳ�νṹ�����ģʽʹ���û��Ե����������϶����ʹ�þ���һ���ԡ�
//��Ҫ����������������ͽṹ�������У�ģ���˼�Ԫ�غ͸���Ԫ�صĸ���ͻ�������������Ԫ��һ����������Ԫ�أ��Ӷ�ʹ�ÿͻ������븴��Ԫ�ص��ڲ��ṹ���
//��ʱʹ�ã� 1�������ʾ����Ĳ���-�����νṹ�����νṹ���� 2����ϣ���û�������϶����뵥������Ĳ�ͬ���û���ͳһ��ʹ����Ͻṹ�е����ж���
//��ν������֦��Ҷ��ʵ��ͳһ�ӿڣ���֦�ڲ���ϸýӿڡ�
//�ؼ����룺��֦�ڲ���ϸýӿڣ����Һ����ڲ����� List������� Component��
//Ӧ��ʵ���� 1���������ʽ����������������������һ�������������У���һ��������Ҳ�����ǲ�����������������һ���������� 2���� JAVA AWT �� SWING �У����� Button �� Checkbox ����Ҷ��Container ����֦��
//�ŵ㣺 1���߲�ģ����ü򵥡� 2���ڵ��������ӡ�
//ȱ�㣺��ʹ�����ģʽʱ����Ҷ�Ӻ���֦����������ʵ���࣬�����ǽӿڣ�Υ������������ԭ��
//ʹ�ó��������֡����峡���������β˵����ļ����ļ��еĹ���
//ע���������ʱΪ�����ࡣ


public class CompositePatternDemo {
	

	
	   public static void main(String[] args) {
	      Employee CEO = new Employee("John","CEO", 30000);

	      Employee headSales = new Employee("Robert","Head Sales", 20000);

	      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

	      Employee clerk1 = new Employee("Laura","Marketing", 10000);
	      Employee clerk2 = new Employee("Bob","Marketing", 10000);

	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);

	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);

	      //��ӡ����֯������Ա��
	      System.out.println(CEO); 
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }        
	   }
	}
