package arrays.arrayListInternalWorking;

import java.util.ArrayList;

public class ArrayListInternalGrow {

    public static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            return ((Object[]) field.get(list)).length;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Initial Capacity: " + getCapacity(list));

        // Add the first 10 elements
        for (int i = 1; i <= 10; i++) {
            list.add(i);
            System.out.println("Added: " + i + ", Size: " + list.size() + ", Capacity: " + getCapacity(list));
        }

        // Add the 11th element, causing resize
        list.add(11);
        System.out.println("Added: 11, Size: " + list.size() + ", Capacity: " + getCapacity(list));

        // Add elements 12-16
        for (int i = 12; i <= 16; i++) {
            list.add(i);
            System.out.println("Added: " + i + ", Size: " + list.size() + ", Capacity: " + getCapacity(list));
        }

        // Add the 17th element, causing another resize
        list.add(17);
        System.out.println("Added: 17, Size: " + list.size() + ", Capacity: " + getCapacity(list));
    }
}