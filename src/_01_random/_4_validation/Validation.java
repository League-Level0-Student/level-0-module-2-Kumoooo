//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		

		// 1. Use each value of randomNumber to give the user a random compliment.
for (int i = 0; i < 10; i++) {

	int randomNumber = randomMaker.nextInt(5);
	
	if (randomNumber == 0) {
		System.out.println("You Rock");
	} else if (randomNumber == 1) {
		System.out.println("You're Cool!");
	} else if (randomNumber == 2) {
		System.out.println("You're Nice!");
	} else if (randomNumber == 3) {
		System.out.println("You're Funny");
	} else if (randomNumber == 4) {
		System.out.println("You're Amazing");
	} 
	

}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
