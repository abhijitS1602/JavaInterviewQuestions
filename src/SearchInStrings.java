public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Abhijit";
        char target = 'z';
        boolean charFound = false;
        if(name.length() == 0){
            System.out.println("char doesnt exist as the string is empty");
        }
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target) {
                System.out.println("Char found at index " +i);
                charFound = true;
            }
        }

        if (!charFound){
            System.out.println("Char "+target+ " does not exist in the string: "+name);
        }
    }
}
