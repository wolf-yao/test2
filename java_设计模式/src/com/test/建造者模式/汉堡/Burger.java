package com.test.建造者模式.汉堡;

import com.test.建造者模式.Item;
import com.test.建造者模式.包装.Packing;
import com.test.建造者模式.包装.Wrapper;

public abstract class Burger implements Item {
	
	//////汉堡
	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	}
