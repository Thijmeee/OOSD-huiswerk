package Week4;

public class Opdracht_18_12 {

    public static String newWord = "";

    public static void main(String[] args) {
        reverseDisplay("lekker", 0);

    }

    public static void reverseDisplay(String value) {
        if (!value.isEmpty()) {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }

    public static void reverseDisplay(String value, int high) {
        if (high >= 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
    }
}
