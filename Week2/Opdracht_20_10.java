package Week2;

import java.util.*;

public class Opdracht_20_10 {
    public static void main(String[] args) {
        Stack<String> textbook1 = new Stack<>();
        textbook1.add("Chemistry");
        textbook1.add("Mathematics");
        textbook1.add("Biology");
        textbook1.add("English");

        Stack<String> textbook2 = new Stack<>();
        textbook2.add("Biology");
        textbook2.add("English");
        textbook2.add("Geography");
        textbook2.add("Physics");

        Set<String> firstStackSet = new HashSet<>(textbook1);
        Set<String> secondStackSet = new HashSet<>(textbook2);

        firstStackSet.removeAll(textbook2);
        System.out.println("Words only in first stack: " + firstStackSet);

        secondStackSet.removeAll(textbook1);
        System.out.println("Words only in second stack: " + secondStackSet);

        firstStackSet = new HashSet<>(textbook1);
        firstStackSet.retainAll(textbook2);
        System.out.println("Words only in both stacks: " + firstStackSet);
    }
}
