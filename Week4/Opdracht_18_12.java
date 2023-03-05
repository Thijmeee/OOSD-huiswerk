package Week4;

public class Opdracht_18_12 {

    public static String newWord = "";

    public static void main(String[] args) {
        reverseDisplay("lekker", 4);

    }

    public static void reverseDisplay(String value, int high){
        if (high != 0){
            newWord = value.charAt(value.length() - 1) + "";
            value = value.substring(0, value.length() - 1);
            System.out.println(newWord);
            reverseDisplay(value, high - 1);
        }
    }
}
