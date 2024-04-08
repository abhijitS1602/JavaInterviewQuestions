public class CountEvenAndOddDigit {
    public static void main(String[] args) {
        int number = 222;
        int evenCounter = 0;
        int oddCounter = 0;
        while(number > 0){
            if(number % 2 ==0){
                evenCounter++;
            } else {
                oddCounter++;
            }
            number = number / 10;
        }
        System.out.println(evenCounter);
        System.out.println(oddCounter);
    }
}
