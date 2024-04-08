//Q: find if Target element Exists in the given array.
// arr = [12, 18, 88, 43, 14, 37, 15]

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 18, 88, 43, 14, 14, 15};
        int target = 14;
        if(arr.length == 0){
            System.out.println("Does not exist");
        }

        boolean elementFound = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                System.out.println("Element found at index " + i);
                elementFound = true;
                break;
            }
        }
        if(!elementFound) {
            System.out.println("Element is not present");
        }
    }
}
