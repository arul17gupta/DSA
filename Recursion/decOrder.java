import java.util.*;

public class decOrder {

    public static void DecOrder(int n) {

if(n ==1){
    System.out.println(1);
    return;
}

        System.out.println(n + " ");
        DecOrder(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        DecOrder(n);
    }
}
