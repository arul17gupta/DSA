package Basic;
import java.util.*;


public class calculator {
    public static void main(String args[]) {

        System.out.println("*************   THE CALCULATOR  **************");
        System.out.println("1: ADDITION");
        System.out.println("2: SUBTRACTION");
        System.out.println("3: MULTIPLICATION");
        System.out.println("4: DIVISION");
        System.out.println("5: MODULUS");

        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the Operation");
        key = sc.nextInt();

        switch (key) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            case 5:
                System.out.println(a % b);
                break;

                default: System.out.print("Enter the correct operation");
                break;

        }

    }
}
