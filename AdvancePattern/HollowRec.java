import java.util.*;
import java.util.concurrent.Flow.Publisher;

import javax.lang.model.util.ElementScanner14;

public class HollowRec {

public static void HollowRec(int totRow, int totCol){
for (int i = 1; i <=totRow; i++) {
    for (int j = 1; j <=totCol; j++) {
        if(i==1 || i ==totRow || j==1 || j==totCol ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
    
}
}
    

    public static void main(String[] args) {
        HollowRec(15, 20);
    }
}
