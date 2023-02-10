package Week2;

import java.util.ArrayList;
import java.util.List;

public class Opdracht_20_4 {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();

        list.add(new StringBuilder("kip"));
        list.add(new StringBuilder("tok"));
        list.add(new StringBuilder("lol"));
        list.add(new StringBuilder("kippie"));

        list.stream().forEach(stringBuilder -> {
            System.out.println(stringBuilder.substring(0, 1).toUpperCase() + stringBuilder.substring(1, stringBuilder.length()));
        });
    }
}
