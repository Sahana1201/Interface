package com.xworkz.Interface.ICC.Example;

public class GadgetTester {

	public static void main(String[] args) {
		Gadget mobile = new Mobile();
		mobile.display();
		mobile.ScreenType();
		mobile.type();
		System.out.println(Gadget.brand);

		Nokia nokia = new Nokia();
		nokia.brand = "nokia";
		nokia.price = 45000d;
		nokia.display();
		nokia.ScreenType();

	}

}
