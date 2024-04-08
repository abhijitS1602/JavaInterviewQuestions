import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "aabbcccdddd";
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);

            if(!map1.containsKey(ch)){
                map1.put(ch, 1);
            } else{
                map1.put(ch, map1.get(ch) + 1);
            }
        }

        for(char ch : map1.keySet()){
            System.out.println("Number of occurence for "+ch+ " is: "+map1.get(ch));
        }
    }
}
