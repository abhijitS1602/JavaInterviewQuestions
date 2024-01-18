import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ReverseAString("Abhijit");
//        removeJunkFromString("abcd!@#21123");
//        reverseANumber(123);
//        findMissingNumber();

//        duplicateElementInArray(new int[]{1, 1, 2, 3, 4, 4, 5});
//        ArmStrongNumber();
//        duplicateElementsInString();

//        removeDuplicateWordsFromString();

//        System.out.println(subStringIsPresentOrNot());
    }

    private static boolean subStringIsPresentOrNot() {
        String str = "Abhijit Automation Testing";
        String sub_str = "Auto";
        return str.matches("(.*)" + sub_str + "(.*)");
    }

    private static void removeDuplicateWordsFromString() {
        String str = "I am abhijit abhijit";
        String[] charArray = str.split(" ");
        Set<String> hashset1 = new LinkedHashSet<String>();

        for(String x : charArray){
            hashset1.add(x);
        }

        Iterator<String> itr = hashset1.iterator();
        System.out.println("original string: "+str);
        System.out.print("Removed Duplicated string: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }

    private static void duplicateElementsInString() {
        String str = "are are there any duplicate Elements in this string";
        String[] str_array = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : str_array) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println("Duplicate word is : " + key);
            }
        }
    }

    private static void ArmStrongNumber() {
        int number = 153, sum = 0, sum1 = 0;
        int ans = number;
        while (number > 0) {
            sum = number % 10;
            sum = sum * sum * sum;
            sum1 = sum1 + sum;
            number = number / 10;
        }
        System.out.println(sum1 + " " + ans);
        if (sum1 == ans) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    private static void duplicateElementInArray(int[] arr) {

        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map1.containsKey(arr[i])) {
                map1.put(arr[i], 1);
            } else {
                map1.put(arr[i], map1.get(arr[i]) + 1);
            }
        }

        for (int key : map1.keySet()) {
            if (map1.get(key) > 1) {
                System.out.println("duplicate element is: " + key);
            }
        }
    }

        private static void findMissingNumber () {
            int[] arr = {1, 2, 4, 5, 6};
            int sum = 0, sum1 = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            for (int i = arr[0]; i <= arr.length + 1; i++) {
                sum1 = sum1 + i;
            }
            System.out.println("Missing number is: " + (sum1 - sum));
        }

        private static void reverseANumber ( int number){
            int rev = 0;
            while (number != 0) {
                rev = rev * 10 + number % 10;
                number = number / 10;
            }
            System.out.println(rev);
        }

        private static void removeJunkFromString (String str){
            str = str.replaceAll("[^a-zA-z]", "");
            System.out.println(str);
        }

        private static void ReverseAString (String str){
            int len = str.length();
            String rev = "";
            for (int i = len - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);
        }
    }