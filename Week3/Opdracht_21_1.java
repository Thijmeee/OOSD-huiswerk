package Week3;

import java.util.Stack;

public class Opdracht_21_1 {
    public static void main(String[] args) {
        Stack<String> firstStack = new Stack<String>();
        firstStack.add("Chemistry");
        firstStack.add("Mathematics");
        firstStack.add("Biology");
        firstStack.add("English");

        Stack<String> secondStack = new Stack<String>();
        secondStack.add("Biology");
        secondStack.add("English");
        secondStack.add("Geography");
        secondStack.add("Physics");

        Stack<String> presentFirst = new Stack<>();
        presentFirst.addAll(firstStack);
        presentFirst.removeAll(secondStack);
        System.out.println("Only in the first stack: " + presentFirst);

        Stack<String> presentSecond = new Stack<>();
        presentSecond.addAll(secondStack);
        presentSecond.removeAll(firstStack);
        System.out.println("Only in the second stack: " + presentSecond);

        Stack<String> presentBoth = new Stack<>();
        presentBoth.addAll(secondStack);
        presentBoth.retainAll(firstStack);
        System.out.println("In both stacks: " + presentBoth);
    }
}
