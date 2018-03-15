package com.test.业务代表模式;

public class Client {
    
	   BusinessDelegate businessService;

	   public Client(BusinessDelegate businessService){
	      this.businessService  = businessService;
	   }

	   public void doTask(){        
	      businessService.doTask();
	   }
	}
