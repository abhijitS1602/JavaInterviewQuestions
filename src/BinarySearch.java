public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearchAlgorithm());
    }

    static int binarySearchAlgorithm(){
        int target = 4;
        int[] arr = {1, 3, 4, 7, 9, 11};
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;

            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;


    }
}
