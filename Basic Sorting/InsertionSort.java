import java.util.*;

public class InsertionSort {

    public static void Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = curr;
        }

    }

    public static void Print(int arr[]) {
        System.out.println("The Sorted Array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        // Sort(arr);
        Arrays.sort(arr);
        Print(arr);
    }
}
