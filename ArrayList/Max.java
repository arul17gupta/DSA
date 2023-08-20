import java.util.*;

public class Max {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            
        }
        System.out.println(max);
    }
}
