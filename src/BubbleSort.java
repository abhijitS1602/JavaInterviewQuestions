import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 1, 5, 6, 99, 70};

        for(int i=0 ; i<a.length; i++){
            for(int j = 1; j<a.length-i; j++){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        for (int k = 0; k < a.length; k++){
            System.out.println(a[k]);
        }
    }
}
