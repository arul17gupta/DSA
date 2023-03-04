import java.util.*;



public class EvenOdd {
    
    public static void Oddeven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("The number is even");
        }
        else
        System.out.println("The number is odd");
    }

    public static int get(int n,int i) {

        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else
        return 1;
    }

    public static int set(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    } 

    public static int clear() {
        
    }

    public static void main(String[] args) {
       System.out.println(set(10, 2));

    }


}
