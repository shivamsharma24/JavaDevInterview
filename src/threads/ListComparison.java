package threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList add: " + duration + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList get: " + duration + " ns");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList add: " + duration + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList get: " + duration + " ns");
    }
}
