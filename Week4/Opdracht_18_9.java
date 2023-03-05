package Week4;

public class Opdracht_18_9 {
    public static String newWord = "";

    public static void main(String[] args) {
        reverseDisplay("abcd");

        System.out.println(newWord);
    }

    public static void reverseDisplay(String value){
        if (!value.isEmpty()){
            newWord = newWord + value.charAt(value.length() - 1);
            value = value.substring(0, value.length() - 1);
            reverseDisplay(value);
        }
    }
}
