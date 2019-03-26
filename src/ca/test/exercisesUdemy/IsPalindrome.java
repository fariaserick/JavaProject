package ca.test.exercisesUdemy;

public class IsPalindrome {
	public static boolean isPalindrome(int number) { // 1221
		
		int[] intArr = new int[String.valueOf(Math.abs(number)).length()];
		StringBuilder arrInt = new StringBuilder();
		int leng = (int) (Math.log10(number) + 1); // Logarithm equivalent for length
		
		int length = 0;
		long temp = 1;
//		Count the number of digits from a number without converting to array
		while (temp <= number) {
		    temp *= 10;
		    length++;
		}
		int num = number;
		
		if(num < 10)
			return false;
		
		int k = 0;
		while(num > 0) {
			int digit = num % 10;
			arrInt.append(digit);
			num /= 10;
			k++;
		}
		int rev = Integer.parseInt(arrInt.toString());
		System.out.println(rev + " == " + number);
		if(rev == number)
			return true;
		else
			return false;
		
		
//		String value = Integer.toString(Math.abs(number));
//		String[] arr = value.split("");
//		int len = arr.length-1;
//		String[] revArr = new String[arr.length];
//		int j = 0;
//		for(int i = len; i >= 0; i--) {
//			revArr[i] = arr[j];
//			j++;
//		}
//		String rev = String.join("", revArr);
//		String a = String.join("", arr);
//		
//		if(rev.equals(a))
//			return true;
//		else
//			return false;
    }
}
