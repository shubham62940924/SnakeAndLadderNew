package com.bzlbsnake;

import java.util.Random;

public class SnakeAndLadder {

	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static int diceCount = 0;
	static final int PLAYERONE = 1;
	static final int PLAYERTWO = 2;

	public static int positionCheck(int dice, int position, int optionCheck) {

		if ((optionCheck == LADDER) && (position + dice) <= 100) {
			System.out.print(" ladder!!!");
			position = position + dice;
		} else if (optionCheck == SNAKE) {
			System.out.print(" snake!!!");
			position = position - dice;
		} else {
			System.out.print(" noPlay!!!");
			position = position;
		}
		if (position < 0) {
			position = 0;
		}
		System.out.println("position: " + position);
		return position;

	}

	public static void main(String[] args) {
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int player = PLAYERONE;
		System.out.println("playerOnePosition: " + playerOnePosition);
		System.out.println("playerTwoPosition: " + playerTwoPosition);
		Random ran = new Random();

		while ((playerOnePosition < 100) && (playerTwoPosition < 100)) {

			int dice = ran.nextInt(6) + 1;
			System.out.println("dice: " + dice);
			++diceCount;
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: " + optionCheck);

			if (player == PLAYERONE) {

				playerOnePosition = positionCheck(dice, playerOnePosition, optionCheck);
				if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) {
					player = PLAYERTWO;
				}
			} else if (player == PLAYERTWO) {
				playerTwoPosition = positionCheck(dice, playerTwoPosition, optionCheck);
				if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) {
					player = PLAYERONE;
				}
			}

		}
		System.out.println();
		System.out.println("playerOnePosition!!: " + playerOnePosition);
		System.out.println("playerTwoPosition!!: " + playerTwoPosition);
		System.out.println("diceCount: " + diceCount);
		if (playerOnePosition == 100) {
			System.out.println("Player One Wins");
		} else {
			System.out.println("player Two Wins");
		}
	}
}