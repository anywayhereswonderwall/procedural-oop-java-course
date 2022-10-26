public class Task9 {
    public static void main(String[] args) {
        solveFor();
        solveWhile();
        solveDoWhile();
    }
    public static void solveFor() {
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
    public static void solveWhile() {
        int x = 0;
        while (x<=100){
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
    public static void solveDoWhile() {
        int x = 0;
        do {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        } while (x<=100);
    }
}
