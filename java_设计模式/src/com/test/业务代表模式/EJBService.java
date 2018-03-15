package com.test.业务代表模式;

public class EJBService implements BusinessService {

	   @Override
	   public void doProcessing() {
	      System.out.println("Processing task by invoking EJB Service");
	   }
	}
