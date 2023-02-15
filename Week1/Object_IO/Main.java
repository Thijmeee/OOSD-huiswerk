package Week1.Object_IO;

public class Main {
        public static void main(String[] args) {
            Rooster rooster = new Rooster("Wiskunde", "LD201", "Pieter", 2);

            rooster.writeFile("Week1/Object_IO/rooster.txt");

            rooster.readFile("Week1/Object_IO/rooster.txt");
        }
}
