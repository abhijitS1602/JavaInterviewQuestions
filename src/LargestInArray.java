public class LargestInArray {
    public static void main(String[] args) {
        int a[] =  {1, 2, 4, 3, 7, 5, 8, 6};
        int largest = a[0];

        for (int i = 1; i < a.length; i++){
                if(a[i] > largest){
                    largest = a[i];
                }
            }
        System.out.println(largest);

    }
}
