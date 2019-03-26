package ca.test.exercisesUdemy;

public class SecondsMinutes {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value!";
	
	public static String getDurationString(long minutes, long seconds) {
		if(!(minutes >= 0) || !(seconds >= 0) || !(seconds <= 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		long leftOverMin = minutes % 60;
		long hours = (minutes - leftOverMin) / 60;
		
		return addZero(hours, "h ")+ addZero(leftOverMin, "m ") + addZero(seconds, "s");
	}
	
	public static String getDurationString(long seconds) {
		if(!(seconds >= 0)) {
			return INVALID_VALUE_MESSAGE;
		}
		long leftOverSec = seconds % 60;
		long minutes = (seconds - leftOverSec) / 60;
		
		return getDurationString(minutes, leftOverSec);
	}
	
	private static String addZero(long value, String extra) {
		String result = "";
		if(value < 10) {
			result = "0" + value + extra;
		}
		return result;
	}
}
