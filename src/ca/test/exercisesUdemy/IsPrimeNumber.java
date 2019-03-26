package ca.test.exercisesUdemy;

public class IsPrimeNumber {
	
	public static long sumPrimeNumbers(int num) {
		long result = 0;
		int count = 0;
		for(int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				result += i;
				System.out.println(i);
				count++;
			}
			if(count == 5)
				break;
		}
		return result;
	}
	
	private static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
