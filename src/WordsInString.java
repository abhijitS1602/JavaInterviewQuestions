import java.lang.reflect.Array;
import java.util.Arrays;

public class WordsInString {
    public static void main(String[] args) {
        String str = "This is good programming also";
        String[] str_arr = str.split(" ");

        System.out.println(Arrays.toString(str_arr));
        System.out.println(Arrays.stream(str_arr).count());

    }
}
