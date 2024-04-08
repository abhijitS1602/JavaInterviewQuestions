public class SwapStringsWithoutTempVariable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int str1_Length = str1.length();
        int str2_Length = str2.length();

        str1 = str1 + str2; // HelloWorld
        str2 = str1.substring(0,str1_Length);
        str1 = str1.substring(str1_Length, str1_Length+str2_Length);
        System.out.println(str1);
        System.out.println(str2);



    }
}
