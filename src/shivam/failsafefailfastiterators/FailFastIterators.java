package shivam.failsafefailfastiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterators {
    public static void main(String[] args) {

        List<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()){
            String fruit = itr.next();
            System.out.println(fruit);

            //trying to modify
            fruits.remove("orange");
        }
    }
}
