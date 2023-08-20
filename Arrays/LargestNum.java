import java.util.*;

public class LargestNum {
    public static void GetLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        System.out.println("The largest Number in th earray is: " + largest);
    }
    
    public static void main(String[] args) {
        
        int num[] = { 1, 6, 85, 23, 74, 93, 6, 1000 };
        GetLargest(num);
    }
}
