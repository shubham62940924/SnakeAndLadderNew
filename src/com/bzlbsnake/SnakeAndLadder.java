package com.bzlbsnake;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int position = 0;
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		System.out.println("dice:" + dice);

	}

}
