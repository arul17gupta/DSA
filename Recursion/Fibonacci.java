import java.util.*;


public class Fibonacci {


    public static int fibo(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        int fib = fibo(n-1) + fibo(n-2);
        return fib;
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
System.out.println(fibo(n));

 }   
}
