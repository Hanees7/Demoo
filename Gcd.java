
import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        int a = 50, b = 60;
        int c = 0;

        int d = Math.max(a, b);
        for (int i = 2; i < d; i++) {
            if (a % i == 0 && b % i == 0)
                c = i;

        }
        System.out.println(c);
    }
}
