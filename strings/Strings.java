import java.util.*;

public class Strings {

    public static boolean isPalindrome(String name) {
        int n = name.length();
        for (int i = 0; i < name.length()/2; i++) {
            if(name.charAt(i) != name.charAt(n-1-i)){
return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str1 = new String("xyz@#1234");

        // strings are immutable
        System.out.print("enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        
        System.out.println(name);
      
        System.out.println(isPalindrome(name));
    }
}
