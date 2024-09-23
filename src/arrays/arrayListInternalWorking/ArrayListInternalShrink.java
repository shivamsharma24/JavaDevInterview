package arrays.arrayListInternalWorking;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListInternalShrink {
    // Method to get the current capacity of the ArrayList using reflection
    public static int getCapacity(ArrayList<?> list) {
        try {
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            return ((Object[]) field.get(list)).length;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Initial Capacity: " + getCapacity(list));

        // Add elements to grow the list
        for (int i = 1; i <= 17; i++) {
            list.add(i);
            System.out.println("Added: " + i + ", Size: " + list.size() + ", Capacity: " + getCapacity(list));
        }

        // Remove elements to see how the capacity changes
        for (int i = 17; i >= 10; i--) {
            list.remove(list.size() - 1);
            System.out.println("Removed: " + i + ", Size: " + list.size() + ", Capacity: " + getCapacity(list));
        }

        // Shrink the list to fit the current size
        list.trimToSize();
        System.out.println("After trimToSize, Size: " + list.size() + ", Capacity: " + getCapacity(list));
    }
}
