package com.bzlbsnake;

import java.util.Random;

public class SnakeAndLadder {
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;

	public static void main(String[] args) {
		int position = 0;
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		System.out.println("dice:" + dice);
		int optionCheck = rand.nextInt(3);
		System.out.println("optionCheck: " + optionCheck);

		if (optionCheck == LADDER) {
			System.out.println("ladder!!!");
			position = position + dice;
		} else if (optionCheck == SNAKE && position > dice) {
			System.out.println("snake!!!");
			position = position - dice;
		} else {
			System.out.println("noPlay!!!");
			position = position;
		}
		System.out.println("position: " + position);
	}

}
