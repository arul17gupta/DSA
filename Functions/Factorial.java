import java.util.*;

public class Factorial {

public static int Fact(int a){
    int F = 1;
    for (int i = 1; i <=a; i++) {
        F =F*i;
    }
    return F;

}


    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    int f=  Fact(a);
    System.out.println("The factorial is: " + f);
        
    }
}
