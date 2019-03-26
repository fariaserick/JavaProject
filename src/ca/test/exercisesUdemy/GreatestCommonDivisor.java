package ca.test.exercisesUdemy;

import java.util.*;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10)
            return -1;
        
		List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList());
		List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList());
        
        for(int i = 1; i <= first; i++) {
            if(first % i == 0) {
            	arr1.add(i);
            }
        }
        for(int j = 1; j <= second; j++) {
            if(second % j == 0) {
            	arr2.add(j);
            }
        }
        int x = arr1.size() - 1;
        while(x > 0) {
        	for(int j = arr2.size() - 1; j > 0; j--) {
        		if(arr1.get(x) == arr2.get(j))
        			return arr1.get(x);
            }
        	x--;
        }
        return -1;
        
        
        
        
        // Really long answer with lots of data conversion --------
        
//        StringBuilder arr1 = new StringBuilder();
//        StringBuilder arr2 = new StringBuilder();
//        
//        for(int i = 1; i <= first; i++) {
//            if(first % i == 0) {
//            	arr1.append(","+i);
//            }
//        }
//        for(int j = 1; j <= second; j++) {
//            if(second % j == 0) {
//            	arr2.append(","+j);
//            }
//        }
//        String[] num1 = arr1.toString().split(",");
//        String[] num2 = arr2.toString().split(",");
//        int x = num1.length - 1;
//        while(x > 1) {
//        	System.out.println(Integer.parseInt(num1[x]));
//        	for(int j = num2.length - 1; j > 1; j--) {
//        		System.out.println(num1[x] + num2[j]);
//        		if(num1[x].equals(num2[j]))
//        			return Integer.parseInt(num1[x]);
//            }
//        	x--;
//        }
//        return 1;
    }
}
