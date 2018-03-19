package com.test.服务定位器模式;

public class Service2 implements Service {
	   public void execute(){
	      System.out.println("Executing Service2");
	   }

	   @Override
	   public String getName() {
	      return "Service2";
	   }
	}