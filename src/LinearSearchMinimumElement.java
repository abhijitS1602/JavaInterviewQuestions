//find the minimum number the given array: {12, 18, 88, 43, 14, 14, 15};

public class LinearSearchMinimumElement {
    public static void main(String[] args) {
        int[] arr = {122, 18, 88, 43, 14, 14, 1};
        int minimum = arr[0];

        if(arr.length == 0){
            System.out.println("Array is empty");
        }

        for(int i=1; i < arr.length; i ++){
            if(arr[i] <= minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Minimum number is "+ minimum);
    }
}
