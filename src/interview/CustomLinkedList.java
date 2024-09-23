package interview;

public class CustomLinkedList<T> {

    // Node class representing each element in the LinkedList
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the LinkedList
    private Node<T> head;

    // Constructor to initialize an empty LinkedList
    public CustomLinkedList() {
        this.head = null;
    }

    // Method to add an element to the end of the LinkedList
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove the first occurrence of an element from the LinkedList
    public boolean remove(T data) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    // Method to print all elements in the LinkedList
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to check if the LinkedList is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to get the size of the LinkedList
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to clear the LinkedList
    public void clear() {
        head = null;
    }

    // Method to get the element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Printing the list
        System.out.println("LinkedList elements:");
        list.printList();  // Output: 10 -> 20 -> 30 -> 40 -> null

        // Removing an element
        list.remove(20);
        System.out.println("After removing 20:");
        list.printList();  // Output: 10 -> 30 -> 40 -> null

        // Getting an element by index
        System.out.println("Element at index 1: " + list.get(1));  // Output: 30

        // Checking the size
        System.out.println("Size of the list: " + list.size());  // Output: 3

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());  // Output: false

        // Clearing the list
        list.clear();
        System.out.println("After clearing the list:");
        list.printList();  // Output: null
        System.out.println("Is the list empty? " + list.isEmpty());  // Output: true
    }
}
