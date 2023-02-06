import java.util.*;

public class Reverse {
    
public static void reverse(int num[]){
    int first = 0;
    int last = num.length-1;
    while(first<last){
        int temp = num[first];
        num[first] = num[last];
        num[last] = temp;

        first++;
        last--;

    }
}

    public static void main(String[] args) {
        int num[] = {-45, 0,12,34,45,69,78,89,100 };
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print (num[i] + "  ");
        }
        System.out.println();
    }
}
