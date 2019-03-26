package ca.test.exercisesUdemy;

public class SpeedConverter {
	
	public static long toMilesPerHour(double kilometerPerHour) {
		if(kilometerPerHour < 0) {
			return -1;
		}
		return Math.round(kilometerPerHour / 1.609);
	}
	
	public static void speedConverter(double kilometerPerHour) {
		if(kilometerPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHour = toMilesPerHour(kilometerPerHour);
			System.out.println(kilometerPerHour+" km/h "+milesPerHour+" mi/h");
		}
	}
	
	public String test(String text) {
		return "This is a Test: " + text;
	}
	
}
