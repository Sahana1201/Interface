package com.xworkz.Interface.ICC.Example;

public class Mobile implements Gadget {
	
	String brand;
	double price;
	

	@Override
	public void display() {

		System.out.println("Mobile will have LCD display");

	}

	@Override
	public void ScreenType() {

		System.out.println("Mobile will have Touch screen");

	}

	@Override
	public void type() {
		System.out.println("type Mobile ");

	}

	@Override
	public void Brand() {

		System.out.println(" the Brand is Nokia");

	}

}
