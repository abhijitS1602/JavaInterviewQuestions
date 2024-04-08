import java.io.CharArrayReader;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String str = "aaa";
        Set<Character> set1 = new HashSet<Character>();
        StringBuffer strbuff1 = new StringBuffer();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!set1.contains(ch)){
                set1.add(ch);
                strbuff1.append(ch);
            }
        }
        System.out.println(strbuff1.toString());
    }
}
