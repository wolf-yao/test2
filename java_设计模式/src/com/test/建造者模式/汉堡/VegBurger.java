package com.test.建造者模式.汉堡;


public class VegBurger extends Burger {

	///素食汉堡
	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	}
