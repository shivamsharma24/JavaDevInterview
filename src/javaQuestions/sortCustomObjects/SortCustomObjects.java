package javaQuestions.sortCustomObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCustomObjects {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bob", 20));

        // Sort by name
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted by name:");
        people.forEach(System.out::println);

        // Sort by age
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        // Sort by name, then by age
        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println("Sorted by name, then by age:");
        people.forEach(System.out::println);
    }
}
