public class RemoveJunkFromString {
    public static void main(String[] args) {
        String s = "Abhijit Sathe @#!@$";
        s = s.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println(s);
    }
}
