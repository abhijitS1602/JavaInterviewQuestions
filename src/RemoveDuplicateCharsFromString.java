import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        String a = "abcdabcdefc";
        String sub = "";
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character c = a.charAt(i);
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
                sub += a.charAt(i);
                int len = sub.length();
            }
            else {

            }
        }
        System.out.println("Sub: "+sub);
    }
}
