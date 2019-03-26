package ca.test;

import java.lang.*;
import java.nio.IntBuffer;

import ca.test.variablesDatatypesOperators.*;
import ca.test.algorithms.Algorithms;
import ca.test.exercisesUdemy.DecimalComparator;
import ca.test.exercisesUdemy.GetBucketCount;
import ca.test.exercisesUdemy.GreatestCommonDivisor;
import ca.test.exercisesUdemy.IsLeapYear;
import ca.test.exercisesUdemy.IsPalindrome;
import ca.test.exercisesUdemy.MinAndMaxInputChallenge;
import ca.test.exercisesUdemy.NumberToWord;

import static ca.test.exercisesUdemy.IsPrimeNumber.sumPrimeNumbers;
import ca.test.exercisesUdemy.OverloadingMethods;
import ca.test.exercisesUdemy.SecondsMinutes;
import ca.test.exercisesUdemy.SpeedConverter;
import ca.test.exercisesUdemy.SumDigits;
import ca.test.exercisesUdemy.TeenNumberChecker;
import ca.test.exercisesUdemy.UserInput;
import ca.test.exercisesUdemy.ReadingUserInputChallenge;
import ca.test.keywordsAndExpressions.*;

public class Main {

	public static void main(String[] args) {
		
//		ByteShortIntFloatDouble byteShortInt = new ByteShortIntFloatDouble();
//		byteShortInt.ByteShortIntFloatDouble();
//		
//		double num = 200d;
//		
//		Main myMain = new Main();
//		double result = myMain.convertPoundsToKilos(num);
//		
//		CharBoolean charBoolean = new CharBoolean();
//		charBoolean.CharBoolean();
		
//		Operators operators = new Operators();
//		operators.Operators();
				
//		KeywordsExpressions keywordExpressions = new KeywordsExpressions();
//		keywordExpressions.keywordExpression();
		
//		SpeedConverter.speedConverter(10.5);
		
//		SpeedConverter speedConverter = new SpeedConverter();
//		System.out.println(speedConverter.test("This is not static"));
		
//		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
		
//		System.out.println(TeenNumberChecker.hasTeen(23, 15, 30));
		
		// Can't instantiate static method
//		Algorithms.Algorithms();
		
		
//		Method Overloading ------------------------------
		
//		double calcFeetInchesToCentim = OverloadingMethods.calcFeetAndInchesToCentimeters(6, 4);
//		if(calcFeetInchesToCentim > 0.0) {
//			System.out.println(calcFeetInchesToCentim + " cm");
//		}else {
//			System.out.println("Invaild Value");
//		}
		
//		Overloaded method
//		double calcFItoCm = OverloadingMethods.calcFeetAndInchesToCentimeters(32);
//		if(calcFItoCm > 0.0) {
//			System.out.println(calcFItoCm + " cm");
//		}else {
//			System.out.println("Invaild Value");
//		}
		
		
//		Seconds and Minutes Challenge ------------------------
//		System.out.println(SecondsMinutes.getDurationString(61, 45));
		
//		Overloaded method
//		System.out.println(SecondsMinutes.getDurationString(3945L));
//		System.out.println(SecondsMinutes.getDurationString(-41));
//		System.out.println(SecondsMinutes.getDurationString(65,9));
		
		// Return the days of a particular month
//		IsLeapYear isLeapYear = new IsLeapYear();
		// February 2010 =  28 days
//		System.out.println(isLeapYear.getDaysInMonth(2, 2010));
		
		
//		System.out.println(sumPrimeNumbers(1000));
		
		
//		SumDigits sumValues = new SumDigits();
//		System.out.println(sumValues.sumValues(125));
		
		
		// Palindromes
//		IsPalindrome isPalindrome = new IsPalindrome();
//		System.out.println(isPalindrome.isPalindrome(1221));
		
//		boolean result = Main.hasSharedDigit(19, 99);
//		System.out.println(result);
		

//		boolean result = Main.hasSameLastDigit(19, 99, 995);
//		System.out.println(result);
		
		// Greatest Common Divisor from 2 numbers
//		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
		
//		System.out.println(NumberToWord.getDigitCount(0));
//		System.out.println(NumberToWord.reverse(-123));
//		System.out.println(NumberToWord.numberToWords(-123));
		
		
		
//		UserInput userInput = new UserInput();
//		userInput.userInput();
		
		// User Input Challenge sum of 10 values
//		ReadingUserInputChallenge.readingUserInputChallenge();
		
//		MinAndMaxInputChallenge.minAndMaxInputChallenge();
		
//		MinAndMaxInputChallenge.inputThenPrintSumAndAverage();
		
		System.out.println(GetBucketCount.getBucketCount(-3.4, 2.1, 1.5, 2));
		
		System.out.println(GetBucketCount.getBucketCount(3.4, 2.1, 1.5));
		
		System.out.println(GetBucketCount.getBucketCount(6.26, 2.2));
		
	}
	
	public static boolean hasSharedDigit(int par1, int par2) {
        if(par1 < 10 || par1 > 99)
        	return false;
        if(par2 < 10 || par2 > 99)
        	return false;
            
        String[] arr1 = Integer.toString(par1).split("");
        
        String[] arr2 = Integer.toString(par2).split("");
        boolean result = false;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.println(arr1[i] + " == " + arr2[j]);
            	if(arr1[i].equals(arr2[j]) ) {
                    result = true;
                    break;
            	}
            }
        }
        return result;
    }
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        
        int last1 = num1 % 10;
        int last2 = num2 % 10;
        int last3 = num3 % 10;
        
        System.out.println("" + last1 + last2 + last3);
        if(last1 == last2 || last2 == last3 || last1 == last3)
        	return true;
        
        return false;
    }
	
	public static boolean isValid(int num) {
		if(num >= 10 && num <= 1000)
			return true;
		return false;
	}
	
	private static double convertPoundsToKilos(double num) {
		double result = (num * 0.45359237d);
		System.out.println("Result in Kilograms: "+result);
		return result;
	}
	
	public static void printFactors(int number) {
        if(number < 1){
            System.out.println("Invalid Value");
        }
        
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
	

}
