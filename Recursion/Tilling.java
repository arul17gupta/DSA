import java.util.*;

public class Tilling {

    public static int tiling(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int verti = tiling(n - 1);

        // horizontal choice
        int hori = tiling(n - 2);

        int totalWays = verti + hori;
        return totalWays;

    }

    public static void main(String[] args) {
System.out.println(tiling(4));
    }
}
