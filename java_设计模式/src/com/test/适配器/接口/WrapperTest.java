package com.test.ÊÊÅäÆ÷.½Ó¿Ú;

public class WrapperTest {

	
	public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
          
        source1.method1(); 
        System.out.println("123");
        source1.method2();  
        System.out.println("456");
        source2.method1();  
        System.out.println("789");
        source2.method2();  
    }  
	
}
