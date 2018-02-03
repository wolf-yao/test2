package com.test.建造者模式;

import com.test.建造者模式.汉堡.ChickenBurger;
import com.test.建造者模式.汉堡.VegBurger;
import com.test.建造者模式.饮料.Coke;
import com.test.建造者模式.饮料.Pepsi;

public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
	}
