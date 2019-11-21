import java.util.Random;

public class Exercise_9_4 {
    public static void main(String[] args) {
        Random randomNumber = new Random(1000);

        for (int i = 0; i <= 50; i++) {
            System.out.println(randomNumber.nextInt(100));
        }
    }
}
