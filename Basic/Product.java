package Basic;
import java.util.*;


public class Product{
    public static void main(String args[]){
System.out.println("Enter the First Number ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

System.out.println("Enter the Second Number ");
int b = sc.nextInt();

int c = a*b;
System.out.println("The product is " + c);

    }
}