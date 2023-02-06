import java.util.*;



public class LinearSearch {
 
public static void LinearSearch(int num[], int key)
{
    for (int i = 0; i < num.length; i++) {
        if(num[i]==key){
    System.out.println("key is Found at index: ");
        }
    }
}


    public static void main(String[] args) {
        
        int num[] = {2, 4, 5, 89, 45, 62, 14};
        int key = 62;
        LinearSearch(num, key);
    }
}
