import java.util.*;

public class SelectionSort {
    public static void Sort(int arr[]) {

    }

    public static void Print(int arr[]) {
        System.out.println("The Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sort(arr);
        Print(arr);

    }
}