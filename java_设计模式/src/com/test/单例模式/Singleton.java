package com.test.����ģʽ;

public class Singleton {

	
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
    private static Singleton instance = null;  
  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    /* ��̬���̷���������ʵ�� */  
//    public static  synchronized  Singleton getInstance() {  
//        if (instance == null) {  
//            instance = new Singleton();  
//        }  
//        return instance;  
//    }  
    
//    public static Singleton getInstance() {  
//        if (instance == null) {  
//            synchronized (instance) {  
//                if (instance == null) {  
//                    instance = new Singleton();  
//                }  
//            }  
//        }  
//        return instance;  
//    } 
//    
//    
//    
//  
//    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
//    public Object readResolve() {  
//        return instance;  
//    }  
  
    /* �˴�ʹ��һ���ڲ�����ά������ */  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
  
    /* ��ȡʵ�� */  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
	
	
}
