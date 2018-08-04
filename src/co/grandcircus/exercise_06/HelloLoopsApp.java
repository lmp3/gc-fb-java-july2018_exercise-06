package co.grandcircus.exercise_06;

import java.util.Scanner;

public class HelloLoopsApp {
	public static void main(String[] args) {
		//
		// Exercise 06
		// 
		// Task: Use a do-while loop to output "Hello, World!" in a loop. Each time you
		// output "Hello, World!" ask the user whether they would like to continue.
		//
		// Example
		// >>Hello, World!
		// >>Would you like to continue (y/n)? <<y
		// >>Hello, World!
		// >>Would you like to continue (y/n)? <<n
		// >>Goodbye!
		//
		
		Scanner usrInput = new Scanner(System.in); 
		char youDecide = 'y';
		
		do {
			System.out.println("Hello, World!");
			
			System.out.println("Would you like to continue? (y/n)");
			youDecide = usrInput.next().charAt(0);
		}
		while (youDecide == 'y'); {
		}
		
		System.out.println("Goodbye.");
		
		usrInput.close();
	}
}

// First Attempt (incorrect, backwards instruction.)
//
//do {
//	System.out.println("Hello, World!");
//}
//
//while (youDecide == 'y'); {
//	System.out.println("Would you like to continue? (y/n)");
//	youDecide = usrInput.next().charAt(0);
//}
//System.out.println("Goodbye.");