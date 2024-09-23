package arrays.arrayListThreadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSynchronizeList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

        synchronizedList.add(1);
        synchronizedList.add(2);
        synchronizedList.add(3);

        // Synchronized block to iterate over the synchronized list
        synchronized (synchronizedList) {
            for (int value : synchronizedList) {
                System.out.println(value);
            }
        }
    }
}
