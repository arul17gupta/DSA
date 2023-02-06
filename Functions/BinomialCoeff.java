import java.util.*;

public class BinomialCoeff {

    public static int Fact(int a){
        int F = 1;
        for (int i = 1; i <=a; i++) {
            F =F*i;
        }
        return F;
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n  = sc.nextInt();
    int r = sc.nextInt();
    // n  = Fact(n);
    // r = Fact(r);
    int a = n-r;
    int ans = Fact(n)/(Fact(r)*Fact(a));
    System.out.println(ans);

}    
}
