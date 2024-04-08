import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Amagram {
    public static void main(String[] args) {
        String str1 = "abac";
        String str2 = "baac";

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch, 1);
            } else {
                map1.put(ch, map1.get(ch) + 1);
            }
        }

        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(!map2.containsKey(ch)){
                map2.put(ch, 1);
            } else {
                map2.put(ch, map2.get(ch) + 1);
            }
        }

        if(map1.equals(map2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}


