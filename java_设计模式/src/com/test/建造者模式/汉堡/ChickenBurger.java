package com.test.建造者模式.汉堡;


public class ChickenBurger extends Burger {

	/////鸡肉汉堡
	   @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	}
