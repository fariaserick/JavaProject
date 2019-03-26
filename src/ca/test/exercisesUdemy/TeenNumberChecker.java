package ca.test.exercisesUdemy;

public class TeenNumberChecker {

	public static boolean hasTeen(int param1, int param2, int param3) {
        int arr[] = {param1, param2, param3};
        
        for(int i = 0; i < 3; i++){
            if(isTeen(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static boolean isTeen(int param) {
        if(param >= 13 && param <= 19)
            return true;
        else
            return false;
    }
    
}
