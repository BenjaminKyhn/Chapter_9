import java.util.Random;

public class RandomProgram {
    public static void main(String[] args) {
        Random random = new Random(17);
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(36));
        }
    }

}
