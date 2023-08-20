import java.util.*;

public class most_water_op {

    public static int storeWater(ArrayList<Integer> height) {

        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wid = rp - lp;
            int currWater = ht * wid;
            maxWater = Math.max(currWater, maxWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

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

        System.out.println(storeWater(height));
    }
}
