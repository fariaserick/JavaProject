package ca.test.exercisesUdemy;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

	public static DecimalFormat df3 = new DecimalFormat(".###"); 
//	System.out.println("double : " + String.format("%.2f", input));
	
	public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
		
		df3.setRoundingMode(RoundingMode.DOWN);
		
		String fd1 = df3.format(param1);
		String fd2 = df3.format(param2);
		
		// Doesn't work it needs to round Down the value
//		String sd1 = String.format("%.3f", param1);
//		String sd2 = String.format("%.3f", param2);
		
//		double t1 = Math.round(param1 * 1000d) / 1000d;
//		double t2 = Math.round(param2 * 1000d) / 1000d; // Math.round converts result into Long
		System.out.println(fd1 +"  "+ fd2);
//		System.out.println(sd1 +"  "+ sd2);
        if(fd1.equals(fd2)){
            return true;
        }else {
        	return false;
        }
    }
}
