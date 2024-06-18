import java.util.HashMap;

public class CharCountInString {
    public static void main(String[] args) {
        String str="This is a great thing. This is a worst Creature";
        //Character count
        HashMap<Character,Integer> hashmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hashmap.containsKey(str.charAt(i))){
                 hashmap.put(str.charAt(i),1);
            }
            else {
                hashmap.put(str.charAt(i),hashmap.get(str.charAt(i))+1);
            }
        }
        System.out.println(hashmap);


        //For counting words
        HashMap<String,Integer> stringHashmap=new HashMap<>();
        String[] words =str.split("\\s");
        for (String word : words) {
            if (!stringHashmap.containsKey(word)) {
                stringHashmap.put(word, 1);
            } else {
                stringHashmap.put(word, stringHashmap.get(word) + 1);
            }
        }
        System.out.println(stringHashmap);
    }
}
