import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Task13 {
    public static void main(String[] args) {
        solve();
    }
    public static void solve() {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal prod = BigDecimal.ONE;
        for(int i=1; i<50; i++) {
            prod = prod.multiply(new BigDecimal(i));

            e = e.add(BigDecimal.ONE.divide(prod, new MathContext(10000, RoundingMode.HALF_UP)));
        }
        System.out.print(e);
    }
}
