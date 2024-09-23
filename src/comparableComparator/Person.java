package comparableComparator;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main1(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by age using a comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by name using a lambda expression
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
