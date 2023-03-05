package Week4;

public class Opdracht_18_1 {
    public static void main(String[] args) {
        System.out.println(identifyingAnagrams("elbow", "below"));
    }

    public static boolean identifyingAnagrams(String word1, String word2){
       if (word1.length() != word2.length()){
           return false;
       }

       if (word1.isEmpty() && word2.isEmpty()){
           return true;
       }

       if (word2.contains(Character.toString(word1.charAt(0)))){
           String newWord1 = word1.substring(1);
           String newWord2 = word2.replaceFirst(Character.toString(word1.charAt(0)), "");
           return identifyingAnagrams(newWord1, newWord2);
       }
       return false;
    }
}
