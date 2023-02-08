package Week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opdracht12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        int wordCount = 0;
        int charactersCount = 0;
        int linesCount = 0;

        String wordLength = "";

        File file = new File("C:\\Users\\thijm\\OneDrive - Avans Hogeschool\\Documenten\\GitHub\\OOSD-huiswerk\\Week1\\testie");
        Scanner reader = new Scanner(file);

        while (reader.hasNext()){
            wordLength = reader.next();
            System.out.println(wordLength);
            charactersCount = charactersCount + wordLength.length();
            wordCount++;
        }
        System.out.println("Amount of words: " + wordCount);
        System.out.println("Amount of characters: " + charactersCount);
    }
}
