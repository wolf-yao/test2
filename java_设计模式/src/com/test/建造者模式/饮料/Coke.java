package com.test.建造者模式.饮料;


public class Coke extends ColdDrink {

	////可口可乐
	   @Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	}
