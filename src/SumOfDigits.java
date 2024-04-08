import java.util.HashMap;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 11234;
        int total = 0;
         while(number > 0){
             total = total + number % 10;
             number = number / 10;
         }
        System.out.println(total);

    }
}
