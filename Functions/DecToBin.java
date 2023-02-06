import java.util.*;

public class DecToBin {

    public static void DecToBin(int n) {
        int mynum = n;
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("The binary number of "+ mynum + " is: " + bin);
    }

    public static void main(String[] args) {
DecToBin(15);
    }
}
