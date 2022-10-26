public class Task11 {
    public static void main(String[] args) {
        solveFor();
//        solveWhile();
//        solveDoWhile();
    }
    public static void solveFor() {
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                System.out.println(x*y);
            }
        }
    }
    public static void solveWhile() {
        int x = 1;
        int y = 1;
        while (x<=100){
            while (y<=100){
                System.out.println(x*y);
                y++;
            }
            x++;
        }
    }
    public static void solveDoWhile() {
        int x = 1;
        int y = 1;
        do {
            do {
                System.out.println(x*y);
                y++;
            } while (y<=100);
            x++;
        } while (x<=100);
    }
}
