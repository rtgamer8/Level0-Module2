//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int random = randomMaker.nextInt(5);

		System.out.println(random);
		// 1. Use each value of randomNumber to give the user a random compliment.
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "you are nice");
		}

		// 2. Repeat all the code above 10 times

		if (random == 0) {
			JOptionPane.showMessageDialog(null, "you are nice!");
		}
		if (random == 1) {
			JOptionPane.showMessageDialog(null, "you are great!");
		}
		if (random == 2) {
			JOptionPane.showMessageDialog(null, "you are amazing!");
		}
		if (random == 3) {
			JOptionPane.showMessageDialog(null, "you are fantastic!");
		}
		if (random == 4) {
			JOptionPane.showMessageDialog(null, "you are awesome!");
		}

		// 3. Find someone to test out your program. They will like it :)
	}
}
