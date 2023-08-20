import java.util.*;

public class most_water_bf{

    public static int maxWater(ArrayList<Integer> height){

        int maxWater = 0 ;

        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wid = j-i;
                int currWater =  ht*wid;
                maxWater = Math.max(maxWater, currWater);
            }
        }


        return maxWater;
    }


public static void main(String[] args) {

ArrayList <Integer> height = new ArrayList<>();

height.add(1);
height.add(8);
height.add(4);
height.add(3);
height.add(5);
height.add(6);
height.add(7);
height.add(8);
height.add(3);
height.add(6);


System.out.println(maxWater(height));



}

}