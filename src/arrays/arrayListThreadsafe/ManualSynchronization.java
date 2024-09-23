package arrays.arrayListThreadsafe;

import java.util.ArrayList;
import java.util.List;

public class ManualSynchronization {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        //synch block
        synchronized (arrayList) {
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
        }

        //iteating using synchronized block
        synchronized (arrayList) {
            for (int value : arrayList) {
                System.out.println(value);
            }
        }
    }
}
