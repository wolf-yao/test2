package com.test.�������ģʽ;



//�������ģʽ��Transfer Object Pattern�����ڴӿͻ����������һ���Դ��ݴ��ж�����Ե����ݡ��������Ҳ����Ϊ��ֵ���󡣴��������һ������ getter/setter �����ļ򵥵� POJO �࣬���ǿ����л��ģ�����������ͨ�����紫�䡣��û���κε���Ϊ���������˵�ҵ����ͨ�������ݿ��ȡ���ݣ�Ȼ����� POJO�����������͵��ͻ��˻�ֵ�����������ڿͻ��ˣ����������ֻ���ġ��ͻ��˿��Դ����Լ��Ĵ�����󣬲��������ݸ����������Ա�һ���Ը������ݿ��е���ֵ���������������ģʽ��ʵ�塣
//ҵ�����Business Object�� - Ϊ�������������ݵ�ҵ�����
//�������Transfer Object�� - �򵥵� POJO��ֻ������/��ȡ���Եķ�����
//�ͻ��ˣ�Client�� - �ͻ��˿��Է���������߷��ʹ������ҵ�����
public class TransferObjectPatternDemo {
	   public static void main(String[] args) {
	      StudentBO studentBusinessObject = new StudentBO();

	      //������е�ѧ��
	      for (StudentVO student : studentBusinessObject.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }

	      //����ѧ��
	      StudentVO student =studentBusinessObject.getAllStudents().get(0);
	      student.setName("Michael");
	      studentBusinessObject.updateStudent(student);

	      //��ȡѧ��
	      studentBusinessObject.getStudent(0);
	      System.out.println("Student: [RollNo : "
	      +student.getRollNo()+", Name : "+student.getName()+" ]");
	   }
	}
