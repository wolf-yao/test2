package com.test.������ģʽ;

import com.test.������ģʽ.����.ChickenBurger;
import com.test.������ģʽ.����.VegBurger;
import com.test.������ģʽ.����.Coke;
import com.test.������ģʽ.����.Pepsi;

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
