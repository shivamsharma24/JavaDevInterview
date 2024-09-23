package shivam.failsafefailfastiterators;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterators {
    public static void main(String[] args) {
        List<String> fruits = new CopyOnWriteArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println(fruit);

            //trying to modify
            if(!fruits.contains("mango"))
                fruits.add("mango");
        }
        System.out.println(fruits);
    }
}
