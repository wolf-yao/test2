package com.test.建造者模式;

import com.test.建造者模式.包装.Packing;

////产品基类
public interface Item {
	   public String name(); ///名称
	   public Packing packing();///包装
	   public float price();    ///金额
}
