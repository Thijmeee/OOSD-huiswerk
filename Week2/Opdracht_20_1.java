package Week2;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Opdracht_20_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\thijm\\OneDrive - Avans Hogeschool\\Documenten\\GitHub\\OOSD-huiswerk\\Week2\\opdracht20.1.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                arrayList.add(scanner.next());
            }

            Collections.sort(arrayList);
            Collections.reverse(arrayList);
            arrayList.forEach(System.out::println);

            scanner.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
