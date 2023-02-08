package Week2;

import java.util.ArrayList;
import java.util.LinkedList;

public class School_Opdracht_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("ArrayList: " + calculatePerformanceArrayList(integerArrayList) + " ms");

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        System.out.println("LinkedList: " + calculatePerformanceLinkedList(integerLinkedList) + " ms");
    }

    public static long calculatePerformanceArrayList(ArrayList<Integer> arrayList){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Math.pow(10, 5) ; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long calculatePerformanceLinkedList(LinkedList<Integer> linkedList){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Math.pow(10, 5) ; i++) {
            linkedList.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
