package Basic;
import java.util.*;

public class ternary {
public static void main(String[] args) {
        int n;
      System.out.println("Enter the Number: ");
      Scanner sc = new Scanner(System.in);

      int a =  sc.nextInt();
    String type = ((a%2)==0)?"even":"odd";
    System.out.println(type);
}
    
}
