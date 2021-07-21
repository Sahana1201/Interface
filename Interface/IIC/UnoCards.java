package com.xworkz.Interface.IIC;

public class UnoCards implements CradGame, Games {

	@Override
	public void numberOfPlayers() {
		System.out.println("number of Players are 4");

	}

	@Override
	public void rules() {

		System.out.println("we have to empty the cards");

	}

	@Override
	public void cardSize() {
		System.out.println("card size is 108");

	}

}
