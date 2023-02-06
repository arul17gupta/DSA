import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }

    }
}
