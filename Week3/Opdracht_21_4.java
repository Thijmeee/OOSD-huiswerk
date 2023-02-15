package Week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Opdracht_21_4 {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\thijm\\OneDrive - Avans Hogeschool\\Documenten\\GitHub\\OOSD-huiswerk\\Week3\\test.txt"));

            Set<Character> vowels = new HashSet<>();
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');

            int vowelCount = 0;
            int consonantCount = 0;

            int c;
            while ((c = fileReader.read()) != -1) {
                char character = (char) c;
                if (Character.isLetter(character)) {
                    if (vowels.contains(Character.toUpperCase(character))) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
            fileReader.close();

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
