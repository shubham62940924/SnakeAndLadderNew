package com.bzlbsnake;

import java.util.Random;

public class SnakeAndLadder {
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static int diceCount = 0;

	public static void main(String[] args) {
		int position = 0;
		System.out.println("position: " + position);
		while (position < 100) {
			Random rand = new Random();
			int dice = rand.nextInt(6) + 1;
			System.out.println("dice:" + dice);
			++diceCount;
			int optionCheck = rand.nextInt(3);
			System.out.println("optionCheck: " + optionCheck);

			if ((optionCheck == LADDER) && (position + dice) <= 100) {
				System.out.println("ladder!!!");
				position = position + dice;
			} else if (optionCheck == SNAKE) {
				System.out.println("snake!!!");
				position = position - dice;
			} else {
				System.out.println("noPlay!!!");
				position = position;
			}
			if (position < 0) {
				position = 0;
			}
			System.out.println("position: " + position);
			System.out.println("dicecount:" + diceCount);
		}

	}
}
