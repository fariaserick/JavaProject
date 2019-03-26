package ca.test.exercisesUdemy;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	public static void minAndMaxInputChallenge() {
		Scanner scanner = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		//		boolean first = true;

		while(true) {
			System.out.println("Insert a number: ");
			boolean isInt = scanner.hasNextInt();
			if(isInt) {
				int value = scanner.nextInt();
				//				if(first) {
				//					first = false;
				//					min = value;
				//					max = value;
				//				}
				if(value > max)
					max = value;
				if(value < min)
					min = value;
			} else {
				System.out.println("Invalid value!");
				System.out.println("Min = " + min + ", Max = " + max);
				break;
			}
			scanner.nextLine();
		}
		scanner.close();
	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, count = 0;
		long avg = 0L;
		while(true){
			System.out.println("Enter a number: ");
			boolean isInt = scanner.hasNextInt();
			if(isInt){
				int num = scanner.nextInt();
				sum += num;
				count++;
			}else{
				double av = (double)sum / count;
				avg = Math.round(av);
				System.out.println("SUM = " + sum + " AVG = " + avg);
				break;
			}
		}
	}
}
