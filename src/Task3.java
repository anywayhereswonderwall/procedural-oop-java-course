import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static int positive(double num){
        if(num>0){
            return 1;
        }
        else if(num<0){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static String solve() {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double[] roots = new double[2];

        double determinant = b * b - 4 * a * c;

        switch(positive(determinant)) {
            case 1:
                roots[0] = (-b + Math.sqrt(determinant)) / (2 * a);
                roots[1] = (-b - Math.sqrt(determinant)) / (2 * a);
                return Arrays.toString(roots);
            case -1:
                roots[0] = roots[1] = -b / (2 * a);
                return Arrays.toString(roots);
            default:
                return "No roots";
        }
    }
}
