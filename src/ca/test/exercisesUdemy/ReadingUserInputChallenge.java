package ca.test.exercisesUdemy;

import java.util.*;

public class ReadingUserInputChallenge {
	public static void readingUserInputChallenge() {
		Scanner scanner = new Scanner(System.in);
		
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		
		int count = 0, sum = 0;
		
		while(true) {
			int order = count + 1;
			System.out.println("Enter numbeer #"+order+":");
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				int value = scanner.nextInt();
//				list.add(value);
				sum += value;
				count++;
				if(count == 10)
					break;
			}else {
				System.out.println("Invalid number");
			}
			scanner.nextLine();
		}
		
//		list.forEach(item -> {
//			System.out.println("Your numbers were " + item);
//		});
		
		System.out.println("The sum of the values is: " + sum);
		
		scanner.close();
	}
}
