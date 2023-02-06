import java.util.*;

public class BinarySearch {

    public static int BS(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; 
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {-45, 0,12,34,45,69,78,89,100 };
        int key = -45;
       System.out.println(BS(num, key)); 
    }
}
