import java.util.*;

public class RemoveDuplicate {

    public static void checkUnique(String str, int idx, StringBuilder newstr, boolean map[]) {
       if(idx ==str.length()){
        System.out.println(newstr);
        return;
       }

       char currChar = str.charAt(idx);
       if(map[currChar-'a'] == true){
        checkUnique(str, idx+1, newstr, map);
       }
       else{
        map[currChar-'a'] = true;
        checkUnique(str, idx+1, newstr.append(currChar), map);
       }
    }

 public static void main(String[] args) {
      String str = "noonaabanccppsdcdsddcadcqwdqwqd";
      checkUnique( str, 0, new StringBuilder(""), new boolean[26]);
 }   
}
