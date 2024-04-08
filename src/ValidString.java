import java.util.HashMap;
import java.util.Map;

public class ValidString {
    public static void main(String[] args) {
        String a = "()";
        Map<String, Integer> map1 = new HashMap<>();

        for(int i=0; i<a.length(); i++){
            String ch = String.valueOf(a.charAt(i));
            if(!map1.containsKey(ch)){
                map1.put(ch, 1);
            } else {
                map1.put(ch, map1.get(ch) + 1);
            }
        }

        if(map1.get("(") == map1.get(")") &&
                map1.get("[") == map1.get("]") &&
                    map1.get("{") == map1.get("}")){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
