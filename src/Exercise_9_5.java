import java.util.GregorianCalendar;

public class Exercise_9_5 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("The current date is " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + " " + gregorianCalendar.get(GregorianCalendar.YEAR));
    }
}
