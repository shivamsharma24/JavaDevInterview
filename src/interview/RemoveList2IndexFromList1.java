package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

///*List<Integer>11=List.of(1,3,4,5,6);
//List<Integer>12=List.of(0,4,1);*/
//Time Complexity: O(m * n), where m is the size of l2 and n is the size of l1.
//Space Complexity: O(n + m)

public class RemoveList2IndexFromList1 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(List.of(1, 3, 4, 5, 6));
        List<Integer> l2 = List.of(0, 4, 1);

        ArrayList<Integer> sortedl2 = new ArrayList<>(l2);
        //Timsort algorithm
        Collections.sort(sortedl2, Collections.reverseOrder());

        System.out.println(sortedl2);
        //we need to convert list to a mutable one before removing element
        for (int index : sortedl2) {
            l1.remove(index);
        }
        System.out.println(l1);
    }

}
