package com.test.������ģʽ.����;

import com.test.������ģʽ.Item;
import com.test.������ģʽ.��װ.Packing;
import com.test.������ģʽ.��װ.Wrapper;

public abstract class Burger implements Item {
	
	//////����
	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	}
