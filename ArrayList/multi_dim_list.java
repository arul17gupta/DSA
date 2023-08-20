import java.util.*;

public class multi_dim_list{

public static void main(String[] args) {
    
ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);

mainlist.add(list);

ArrayList<Integer> list2 = new ArrayList<>();

list2.add(3);
list2.add(4);
    
mainlist.add(0, list2);
}

}