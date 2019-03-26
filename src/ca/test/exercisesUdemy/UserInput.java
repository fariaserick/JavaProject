package ca.test.exercisesUdemy;

import java.util.Scanner;

public class UserInput {
	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter your birth:");
		int yearOfBirth = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Your name is "+ name);
		System.out.println("Your Birth Year is "+ yearOfBirth);
		
		scanner.close();
	}
}
