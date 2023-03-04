import java.text.BreakIterator;
import java.util.*;

public class XpowerN {

    /*
     * public static int mul(int num, int pow) {
     * if (pow == 0) {
     * return 1;
     * }
     * int ans = num * mul(num, pow - 1);
     * return ans;
     * }
     */

    // OPTIMIZED CODE
    public static int mul(int num, int pow) {
        if (pow == 0) {
            return 1;
        }

        int ans;
        if (pow % 2 == 0) {
            ans = (int) Math.pow(mul(num, pow / 2), 2);
        } else {
            ans = num * (int) Math.pow(mul(num, pow / 2), 2);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mul(2, 10));
    }
}
