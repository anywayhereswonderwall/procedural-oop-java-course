public class Task8 {
    public static void main(String[] args) {
        solveFor();
        solveWhile();
        solveDoWhile();
    }
    public static void solveFor() {
        for (int x = 0; x <= 20; x++) {
            System.out.println(x);
        }
    }
    public static void solveWhile() {
        int x = 0;
        while (x<=20){
            System.out.println(x);
            x++;
        }
    }
    public static void solveDoWhile() {
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x<=20);
    }
}
