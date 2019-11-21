import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Exercise_9_3 {
    public static void main(String[] args) {
        Date date = new Date();

        for (long i = 10000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
