package ca.test.algorithms;

import java.util.*;
import java.util.List;

public class Algorithms {

	public static void Algorithms() {
		int arr[] = {5,3,4,7,9,1,8,2};
		int newarr[] = new int[arr.length+1];
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			newarr[arr[i]-1] = arr[i];
		}
		for(int j = 0; j < newarr.length; j++) {
			System.out.println(newarr[j]);
			if(newarr[j] == 0) {
				result = j+1;
			}
		}
		System.out.println("Result = "+result);

	}
	
	public static List<Integer> New_algorithm() {
		Integer a[] = {1,2,3,4,5,6};
		int i = a.length - 1; // array length = 6 should be length - 1 = 5
		// The while loop will throw an index out of bounds 
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
		List<Integer> listInt = new ArrayList<Integer>(Arrays.asList(a));
		listInt.add(4);
		System.out.println(listInt);
		return listInt;
	}
}
