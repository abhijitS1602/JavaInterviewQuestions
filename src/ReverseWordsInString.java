import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Please reverse me";

        String[] strarr = str.split(" ");

        for(int i=0;i<strarr.length; i++){
            String rev = "";
            for(int j=strarr[i].length() -1 ; j >= 0 ; j--){
                rev = rev + strarr[i].charAt(j);
            }
            strarr[i] = rev;
        }
        System.out.println(Arrays.toString(strarr));
    }
}
