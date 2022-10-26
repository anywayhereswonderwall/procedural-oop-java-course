import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static String solve() {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double[] roots = new double[2];

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            roots[0] = (-b + Math.sqrt(determinant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(determinant)) / (2 * a);
            return Arrays.toString(roots);
        }

        else if (determinant == 0) {
            roots[0] = roots[1] = -b / (2 * a);
            return Arrays.toString(roots);
        }
        return "No roots";
    }
}
