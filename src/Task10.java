public class Task10 {
    public static void main(String[] args) {
        solve();
    }
    public static void solve() {
        int sum = 0;
        int count_numbers = 0;
        double variance = 0;
        for (int x = 0; x < 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
                sum += x;
                count_numbers++;
                variance += x*x;
            }
        }
        variance = variance / count_numbers;
        double deviation = Math.sqrt(variance);
        float mean = sum / count_numbers;
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(deviation);
    }
}
