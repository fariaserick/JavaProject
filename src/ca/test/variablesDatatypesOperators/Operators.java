package ca.test.variablesDatatypesOperators;

public class Operators {

	public void Operators() {
		double firstValue = 20d;
		double secValue = 80;
		
		double myTotal = (firstValue + secValue) * 25;
		
		System.out.println("My Total = " + myTotal);
		double myRemainder = myTotal % 40;
		
		System.out.println("My Remainder = " + myRemainder);
		if(myRemainder <= 20) {
			System.out.println("Total was over the limit " + myRemainder);
		}else {
			System.out.println("Total was under the limit " + myRemainder);
		}
		
	}
}
