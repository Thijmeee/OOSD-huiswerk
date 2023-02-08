package Week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Opdracht12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:/Users/thijm/OneDrive - Avans Hogeschool/Documenten/GitHub/OOSD-huiswerk/Week1/Test.java");
            FileInputStream fileInputStream = new FileInputStream(file);
            int content;
            while ((content = fileInputStream.read()) != -1) {
                // Lees het bestand en verwijder spaties
                if (content != '\n' && content != 13) {
                    System.out.print((char) content);
                }
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
