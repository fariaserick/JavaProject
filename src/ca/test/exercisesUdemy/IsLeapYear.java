package ca.test.exercisesUdemy;

public class IsLeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999)
            return false;
            
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        int result = -1;
        if((year < 1 || year > 9999) || (month < 1 || month > 12))
            return -1;
        
        switch(month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                result =  31;
                break;
            case 2:
                if(isLeapYear(year)){
                    result =  29;
                }else{
                    result =  28;
                };
                break;
            default:
                result =  30;
                break;
        }
        return result;
    }
}
