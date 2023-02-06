import java.util.*;

public class Prime {

//   public static Boolean isPrime(int n) {
//corner cases
//2

// if(n==2){
// return true;
// }

// boolean isPrime = true;
//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {//completely dividing
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }

public static boolean isPrime(int n){
    if (n==2){
        return true;
    }                                                                 //optimized code
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if(n%i==0){
            return false;
        }
    }
    return true;
}

public static void primeInRange(int x, int y){
    for (int i = x; i <=y; i++) {
        if(isPrime(i)){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}




    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter the Range");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
     primeInRange(x, y);



    }

}
