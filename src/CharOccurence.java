import java.util.HashMap;

public class CharOccurence {
    public static void main(String[] args) {
        String str = "abbdcsc";
        int count = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), count);
            }else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        for (Character x : map.keySet()){
            if(map.get(x) > 1){
                System.out.println("Duplicate char: "+x);
            }
        }
    }
}
