import java.util.*;;

public class incOrder {
    public static void Incorder(int n) {
        if(n==1){
            System.out.print("1 ");
            return;
        }
        Incorder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Incorder(n);
        
    }
}
