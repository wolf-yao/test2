package com.test.������ģʽ.����;

import com.test.������ģʽ.Item;
import com.test.������ģʽ.��װ.Bottle;
import com.test.������ģʽ.��װ.Packing;

public abstract class ColdDrink implements Item {

	///���ֻ���
    @Override
    public Packing packing() {
       return new Bottle();
    }

    @Override
    public abstract float price();
}