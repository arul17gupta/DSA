import java.util.*;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for 1st sorted part
        int j = mid + 1; // idx for 2nd sorted part
        int k = 0; // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for leftover elements of 2nd part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy the temp array in original array
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 2, 5, 8, -2, 7, 10 };
        mergeSort(arr, 0, arr.length - 1);
        Print(arr);
    }

}
