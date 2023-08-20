import java.util.ArrayList;

public class Intro {

    public static void main(String args[]) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(3, 9);
        System.out.println(list);


        int elements = list.get(2);
        System.out.println(elements);


        list.remove(2);
        System.out.println("After removing 2nd element: " + list);


        list.set(2, 10);
        System.out.println(list);


        System.out.println(list.contains(1));
        System.out.println(list.contains(4));
        System.out.println(list.contains(6));
        System.out.println(list.contains(10));


        System.out.println(list.size());

        // Print the ArrayList
        for (int i = 0 ; i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}