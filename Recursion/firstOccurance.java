import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.*;


public class firstOccurance {

public static int fo(int arr[] , int key ,int i) {


if(i == arr.length){
    return -1;
}

    if(arr[i]==key){
        return i;
    }
    return fo( arr, key, i+1);
}

    public static void main(String[] args) {
        int arr[] = {1,4,6,9,8,3,5,7,0};
        System.out.println(fo(arr, 5, 0));
    }
}
