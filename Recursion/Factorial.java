import java.util.*;

public class Factorial {

public static int fact(int n) {
    if(n==0){
        return 1;
    }
   int fact = n*fact(n-1);
   return fact;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
