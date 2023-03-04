import java.util.*;

public class lastOccurance {

    public static int lo(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = lo(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 9, 8, 3, 5, 7, 0, 5, 6, 3, 2, 1, 0 };
        System.out.println(lo(arr, 1, 0));
    }
}
