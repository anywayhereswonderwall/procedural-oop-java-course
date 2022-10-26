import java.util.Scanner;  // Import the Scanner class

class Task1 {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static boolean solve() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (2*(a+b+c) > a + b +c) {
            return true;
        }
        return false;
    }
}
