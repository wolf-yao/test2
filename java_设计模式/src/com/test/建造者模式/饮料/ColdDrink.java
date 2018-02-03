package com.test.建造者模式.饮料;

import com.test.建造者模式.Item;
import com.test.建造者模式.包装.Bottle;
import com.test.建造者模式.包装.Packing;

public abstract class ColdDrink implements Item {

	///可乐基类
    @Override
    public Packing packing() {
       return new Bottle();
    }

    @Override
    public abstract float price();
}