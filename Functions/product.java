import java.util.*;

public class product {

public static int Multiply(int a, int b){
int ans;
ans = a*b;

    return ans;
}

    public static void main(String[] args) {
        int a,b,ans;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
       ans =  Multiply(a, b);
        System.out.println("The Answer is: " + ans);
    }
    
}
