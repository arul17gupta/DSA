import java.util.*;

public class BinString {

    public static void oo(int n, int lastplace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        oo(n - 1, 0, str + "0");

        if (lastplace == 0) {

            oo(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        oo(3, 0, "");
    }

}
