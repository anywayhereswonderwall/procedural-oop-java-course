public class Task12 {
    public static void main(String[] args) {
        solve();
    }
    public static void solve() {
        char c;

        for(c = 'A'; c <= 'Z'; ++c){
            System.out.print(c + " ");
         }
        char a;
        System.out.print("\n");
        for(a = 'Z'; a >= 'A'; a--){
            System.out.print(a + " ");
        }
    }
}
