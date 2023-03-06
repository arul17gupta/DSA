import java.util.*;

public class FrndPairing {

    public static int  frndpairing(int n) {

        if(n==1||n==2){
            return n;
        }

        int fnm1 = frndpairing(n-1);
        int fnm2 = ((n-1)*frndpairing(n-2));

        int totalways = fnm1+fnm2;
        return totalways;
    }
    
public static void main(String[] args) {
    
System.out.println(frndpairing(3));

}

}
