package ca.test.exercisesUdemy;

import java.text.DecimalFormat;
import java.util.Arrays;

public class SumDigits {
	
	public static int sumValues(int num) {
		int result = 0;
		
		if(num < 10)
			return -1;
		
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10; // for num = 125 mod = 5 2 1
			result += digit;
//			drop the least significant digit
			num /= 10; // same as number = number / 10
		}
		
		String value = Integer.toString(num);
		String[] arr = value.split("");
		int[] intArr = new int[arr.length];
				
		for(int i = 0;i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
//			result += Integer.parseInt(arr[i]);
			System.out.println(intArr[i]);
		}
		System.out.println("Stream Result: "+Arrays.stream(intArr).reduce((a, b) -> a + b).getAsInt());
		
		String str3 = String.valueOf(num); 
	    System.out.println("String str3 = " + str3);
		
	    Integer obj = new Integer(num); 
	    String str4 = obj.toString(); 
	    System.out.println("String str4 = " + str4); 
	    
		// The class java.text.DecimalFormat is a class that formats a number to a String.
		DecimalFormat df = new DecimalFormat("#,###");
//		DecimalFormat df = new DecimalFormat("#"); 
	    String str5 = df.format(num);
	    System.out.println("DecimalFormat: "+str5);
 
	    String binaryString = Integer.toBinaryString(num); 
	    System.out.println("BinaryString: "+binaryString); 
	    
	    String octalString = Integer.toOctalString(num); 
	    System.out.println("Octal String: "+octalString);
	    
	    String hexString = Integer.toHexString(num); 
	    System.out.println("Hexadecimal String: "+hexString); 
		
		return result;
	}
}
