package ca.test.exercisesUdemy;

public class OverloadingMethods {

	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if(feet < 0 || (inches < 0 || inches > 12)) {
			return -1;
		}
		int totalInches = (feet * 12) + inches;
		double centemeters = totalInches * 2.54;
		return centemeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		if(inches < 0) {
			return -1;
		}
		int leftOverInches = inches % 12;
		int feet = (inches - leftOverInches) / 12;
		System.out.println("feet: " + feet + " inches: " + leftOverInches);
		return calcFeetAndInchesToCentimeters(feet, leftOverInches);
	}
	
}
