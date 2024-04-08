public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int length = arr.length - 1;
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i <= length; i++){
            sum = sum + arr[i];
        }

        for(int i = 0; i < arr[length]+1; i++){
            sum1 = sum1 + i;
        }
        System.out.println("missing number: "+(sum1-sum));
    }
}
