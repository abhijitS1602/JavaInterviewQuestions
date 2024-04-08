import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElementInArray {
    public static void main(String[] args) {

        int a[] = {1, 1, 2, 4, 6, 6, 7, 8, 8};

        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        for(int i=0; i< a.length; i++){
            int element = a[i];
            if(!map1.containsKey(element)){
                map1.put(element, 1);
            } else {
                map1.put(element, map1.get(element)+1);
                System.out.println("duplicate element at index: "+i);
            }
        }

        for(int element : map1.keySet()){
            if(map1.get(element) > 1){
                System.out.println("Duplicate element is: "+ element);
            }
        }

    }
}
