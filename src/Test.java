import java.util.Arrays;

public class Test {
    public static void main(String arg[]){
        int a = 12345;
        int sum = 0;
        while(a > 0){
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);
    }

}
