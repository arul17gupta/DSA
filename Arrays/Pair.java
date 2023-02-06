import java.util.*;

public class Pair {

    public static void pair(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                System.out.println(num[i] + "," + num[j]);
            }
        }
        System.out.println();h
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        pair(num);
    }
}
