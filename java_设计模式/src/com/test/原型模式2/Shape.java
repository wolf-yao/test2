package com.test.ԭ��ģʽ2;

public abstract class Shape implements Cloneable {
	
	////ʹ�� clone���� ����֮ǰ����implements  Cloneable �ӿ�
	//// Cloneable�ӿ�ֻ�Ǹ���ǩ�ӿ� ����Ҫʵ�ַ���
	
	
	
	   private String id;
	   protected String type;
	   
	   abstract void draw();
	   
	   public String getType(){
	      return type;
	   }
	   
	   public String getId() {
	      return id;
	   }
	   
	   public void setId(String id) {
	      this.id = id;
	   }
	   
	   public Object clone() {
	      Object clone = null;
	      try {
	         clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	   }
	}
