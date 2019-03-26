package ca.test;

import java.util.*;
import java.util.stream.Collectors;

public class Questions {

	interface IFruit{
		public String TYPE = "Apple"; // variable in interface can only be "public static final"
	}
	class IFruit2{
		protected static final String Name = "Apple"; // "Add final" static can't be in non-static inner type
	}
	class Fruit implements IFruit{
		
	}
	class Fruit2 extends IFruit2{
		
	}
	
	// Q.11
	static int a = 1111; // executed on start
	static { // executed on start
		a = a-- - --a; // "(a--) = 1111" - "a is 1110 (--a) = 1109" = 2
	}
	{a = a++ + ++a;}// not static so it is not executed
			
	public static void main(String[] args) {
		
//		System.out.println(Fruit.TYPE); // Q.2, Answer = Apple
		
//		int i = 10+ +11- -12+ +13- -14+ +15; // Q 3
//		System.out.println();
		
//		Q.6, Answer = Apple, Only if the variable is private that it won't work
//		System.out.println(Fruit2.Name);
		
		// Q.9
//		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		// Q.10
		Long l1 = 1000 * 60 * 30 * 365L; // has to specify that it is a Long
		// without the L it is an int so for a large number it won't fit an int
		// max value for int is 2147483647
//		Long l2 = 1000 * 30 * 1 * 365; 
//		System.out.println(l1);
		
		// Q.11
//		System.out.print(a); // 2
		
		
		String st = "Testing the water";
		
		// Reverses leter by letter
		String sb = new StringBuilder(st).reverse().toString();
		System.out.println(sb);
		String[] ar = st.split(" ");
		
		String[] t = new String[ar.length];
		
		int i = 0;
		for(int x = ar.length-1; x >= 0; x--) {
			t[i] = ar[x];
			i++;
		}
		System.out.println(Arrays.toString(t));
		
		Integer[] arr = {1,2,3,1,2};
		String[] array = {"tst","ddd","tst"}; // HashSet gets rid of redundancy
//		Set<String> set = new HashSet<>(Arrays.asList(array));
		List<Integer> listInt = new ArrayList<Integer>(Arrays.asList(arr));
		listInt.add(4);
		System.out.println(listInt);
		
		Questions main = new Questions();
//		main.question1();
//		main.question7();
//		main.question8();
		
//		int[] socks = new int[] {1,2,1,2,1,3,2};
//		int result = main.sum(qtd, socks);
//		
//		System.out.println(result); //Arrays.toString(socks)
	}
	
	
	private void question1() {
//		\u000d System.out.println("comment executed"); // Q 1
	}
	
	private void question7() {
		// Q.7, This is a nested class Can't have static inside a non-static class
		final class Constants {public final /*should be final instead static*/ String name = "PI";} 
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// The object would have to be declared to be able to access a non-static method
				Constants constants = new Constants(); 
				System.out.println(constants.name); // Compiler time Error
			}
		});
		thread.start();
	}
	
	private void question8() {
//		Q.8
		Integer i1 = 127; // 127 is the limit size for the cache pool
		Integer i2 = 127; // below 127 both this variables are pointing to the same object
		System.out.println(i1==i2); // true
		
		Integer i3 = 128; // above 128 it will create a new object
		Integer i4 = 128; // Integer is larger them int, because Integer is an Object and has associated methods
		System.out.println(i3==i4); // false
		
		int i5 = 128; // above 128 it will create a new object
		int i6 = 128; // Integer is larger them int, because Integer is an Object and has associated methods
		System.out.println(i3==i4); // true
	}
	
	
	
	
	
	private int sum(int qtd, int[] socks) {
		
//		String[] array = {"tst","ddd","tst"}; // HashSet gets rid of redundancy
//		Set<String> set = new HashSet<>(Arrays.asList(array));
//		Set<int> uni = new HashSet(Arrays.stream(socks).collect(Collectors.toSet()));
//		System.out.println(set);
		
		int[] unique = Arrays.stream(socks).distinct().toArray();
		int result = 0;//new int[unique.length];
		
		for(int i = 0; i < unique.length; i++) {
			int count = test(unique[i], socks);
			if(count % 2 == 0) {
				result += count / 2;
			} else {
				result += (count-1) / 2;
			}
		};
		
		return result;
	}
	
	private int test(int distSock, int[] socks) {
		int result = 0;
		for(int j=0; j < socks.length; j++) {
			if(distSock == socks[j]){
				result++;
			}
		}
		return result;
	}

}
