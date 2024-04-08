import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String ar[]) {

        String s = "abhijit";
        String rev = "";
        for(int i = s.length()-1; i >=0; i--){
            rev += s.charAt(i);
        }
        System.out.println("reverse is:"+rev);
    }
}
