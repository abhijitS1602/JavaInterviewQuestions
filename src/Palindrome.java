public class Palindrome {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        String rev = "";

        for(int i = s1.length() -1; i >= 0; i--){
            rev = rev + s1.charAt(i);
        }

        if(s2.equals(rev)){
            System.out.println("palindrome");
        } else{
            System.out.println("Not a palindrome");
        }

    }

}
