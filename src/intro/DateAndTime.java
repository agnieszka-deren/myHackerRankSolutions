package intro;

import java.util.Calendar;

public class DateAndTime {

   public static String getDay(String day, String month, String year) {
       Calendar calendar = Calendar.getInstance();
       calendar.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
       int dayNum =calendar.get(Calendar.DAY_OF_WEEK);
       String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};
       return days[dayNum-1];
    }
    public static void main(String[] args) {
     
        String month = "3";
        String day = "26";
        String year = "2018";
     
        
        System.out.println(getDay(day, month, year));
    }
}