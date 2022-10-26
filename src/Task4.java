import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(guess());
    }
    public static String guess() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
        Scanner in = new Scanner(System.in);
        int number;
        while (true) {
            number = in.nextInt();
            if (number == randomNum) {
                return "Guessed correctly";
            }
        }
    }
}
