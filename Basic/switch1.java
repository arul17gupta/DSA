package Basic;
import java.util.*;

public class switch1 {
public static void main(String[] args) {
    int key;
    System.out.println("Enter the choice");
    Scanner sc = new Scanner(System.in);
    key = sc.nextInt();
  switch (key) {
    case 1: System.out.println("Samosa");
    break;
    case 2: System.out.println("Kachori");
    break;
    case 3: System.out.println("Maggie");
    break;

    default:System.out.println("Uthh jaaa bc");
        break;
  }
}
    
}
