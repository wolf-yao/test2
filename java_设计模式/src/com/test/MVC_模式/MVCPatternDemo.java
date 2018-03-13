package com.test.MVC_ģʽ;



//MVC ģʽ���� Model-View-Controller��ģ��-��ͼ-�������� ģʽ������ģʽ����Ӧ�ó���ķֲ㿪����
//Model��ģ�ͣ� - ģ�ʹ���һ����ȡ���ݵĶ���� JAVA POJO����Ҳ���Դ����߼��������ݱ仯ʱ���¿�������
//View����ͼ�� - ��ͼ����ģ�Ͱ��������ݵĿ��ӻ���
//Controller���������� - ������������ģ�ͺ���ͼ�ϡ���������������ģ�Ͷ��󣬲������ݱ仯ʱ������ͼ����ʹ��ͼ��ģ�ͷ��뿪��

public class MVCPatternDemo {
	   public static void main(String[] args) {

	      //�����ݿɻ�ȡѧ����¼
	      Student model  = retriveStudentFromDatabase();

	      //����һ����ͼ����ѧ����ϸ��Ϣ���������̨
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //����ģ������
	      controller.setStudentName("John");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Robert");
	      student.setRollNo("10");
	      return student;
	   }
	}
