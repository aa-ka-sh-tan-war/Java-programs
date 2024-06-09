import java.util.Calendar;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] day_of_the_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        int d = c.get(Calendar.DAY_OF_WEEK);
        return day_of_the_week[d - 1];
    }
}
public class DateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        scanner.close();

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }    
}
