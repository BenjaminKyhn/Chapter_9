import java.util.Date;

public class DateProgram {
    public static void main(String[] args) {
        Date date = new Date();
        Date date2 = new Date(88,3,15,15,56,32);
        System.out.println(date.toString());
        System.out.println(date2.toString());
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
