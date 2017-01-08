
/**
 * Write a description of class PP2_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PP2_7 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar myBirthday = new GregorianCalendar(1999, Calendar.APRIL, 12);
        
        cal.add(Calendar.DAY_OF_MONTH, 100);//adding 100 days
        
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
 

        System.out.println("The date in 100 days is " + dayOfMonth + " " +  month + " " + year + ". The day of the week is " + dayName(weekday));

        System.out.println("My brithday will be on a " + dayName(myBirthday.get(Calendar.DAY_OF_WEEK)));
        
        myBirthday.add(Calendar.DAY_OF_MONTH, 10000);//Adding 10,000 days to my birthday
        
        System.out.println("My birthday date will be " + myBirthday.get(Calendar.DAY_OF_MONTH) + " " + myBirthday.get(Calendar.MONTH) + " " + myBirthday.get(Calendar.YEAR));
        
        }
  
    
    public static String dayName(int n) {
        String weekDay;
        
        switch (n) {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break; 
            default:
                weekDay = "ERROR";
                break;
        }
        return weekDay;
    }
}