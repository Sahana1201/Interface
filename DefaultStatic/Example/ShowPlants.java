package com.xworkz.DefaultStatic.Example;

public class ShowPlants implements Plants {

	public void Growing() {
		System.out.println("plant will grow");

	}

	@Override
	public void watering() {

		System.out.println("we need to water plants");

	}

}
