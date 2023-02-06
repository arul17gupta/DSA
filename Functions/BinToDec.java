import java.util.*;

public class BinToDec {

    public static void BinToDec(int n){
       int myNum = n;
        int pow=0;
        int DecNum = 0;

        while(n>0){
            int LastDig = n%10;
            DecNum = DecNum + (int) (LastDig*Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of " + myNum + " is: " + DecNum);
    } 

    public static void main(String[] args) {
     BinToDec(1000);   
    }
}

 