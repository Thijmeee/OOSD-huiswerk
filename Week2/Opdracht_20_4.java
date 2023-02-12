package Week2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Opdracht_20_4{
    public static void main(String[] args) {
       Comparator<GregorianCalendar> com = Comparator.naturalOrder();

       GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2002, 10, 15);
       GregorianCalendar gregorianCalendar2 = new GregorianCalendar(1999, 10, 21);
       GregorianCalendar gregorianCalendar3 = new GregorianCalendar(2023, 7, 15);
       GregorianCalendar gregorianCalendar4 = new GregorianCalendar(2005, 4, 30);
       GregorianCalendar gregorianCalendar5 = new GregorianCalendar(1842, 12, 30);
       GregorianCalendar gregorianCalendar6 = new GregorianCalendar(1954, 9, 7);
       GregorianCalendar gregorianCalendar7 = new GregorianCalendar(1814, 1, 28);
       GregorianCalendar gregorianCalendar8 = new GregorianCalendar(2019, 3, 24);
       GregorianCalendar gregorianCalendar9 = new GregorianCalendar(2007, 4, 12);
       GregorianCalendar gregorianCalendar10 = new GregorianCalendar(2008, 8, 17);

       ArrayList<GregorianCalendar> list = new ArrayList<>();
       list.add(gregorianCalendar1);
       list.add(gregorianCalendar2);
       list.add(gregorianCalendar3);
       list.add(gregorianCalendar4);
       list.add(gregorianCalendar5);
       list.add(gregorianCalendar6);
       list.add(gregorianCalendar7);
       list.add(gregorianCalendar8);
       list.add(gregorianCalendar9);
       list.add(gregorianCalendar10);

       Collections.sort(list, com);

       displayCalender(list);

    }

    public static void displayCalender(ArrayList<GregorianCalendar> list){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateFormatted = " ";
        for (GregorianCalendar gregorianCalendar : list) {
            dateFormatted = simpleDateFormat.format(gregorianCalendar.getTime());
            System.out.println(dateFormatted);
        }
    }

}
