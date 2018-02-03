package com.test.原型模式2;

public abstract class Shape implements Cloneable {
	
	////使用 clone（） 方法之前必须implements  Cloneable 接口
	//// Cloneable接口只是个标签接口 不需要实现方法
	
	
	
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
