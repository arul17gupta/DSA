package Basic;
import java.util.*;

public class Great3num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int a,b,c;
            a =sc.nextInt();
            b =sc.nextInt();
            c =sc.nextInt();
            if((a>=b) &&( a>=c)){
                System.out.println("Largest is a");
            }
            else if (b>=c){
                System.out.println("Largest is b");
            }
            else{
                System.out.println("Largest is c");
            }
    }
    
}
