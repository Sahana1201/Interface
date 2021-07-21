package com.xworkz.DefaultStatic.Example;

public interface Plants {
	
	static void Growing() {
	} 
	
	default void watering() {
		System.out.println("hi");
	}
	
	
	//we cant have static method in interface because we cant create Constructor 
	//so we cant have instance for interface
	//we cant have method implementation in interface 

}
