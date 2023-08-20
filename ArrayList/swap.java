import java.util.*;

public class swap {

    public static void Swap(ArrayList<Integer> list , int idx1, int idx2) {
        int temp =list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(18);
        list.add(78);
        list.add(29);
        list.add(12);
        list.add(60);
        list.add(45);

        System.out.println("Enter the 1st index: ");
        Scanner sc = new Scanner(System.in);
        int idx1 = sc.nextInt();
        System.out.println("Enter the 2nd index: ");
        int idx2 = sc.nextInt();

        System.out.println(list);
 
        Swap(list, idx1, idx2);

        System.out.println(list);
    }

}
