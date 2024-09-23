package javaQuestions.immutable;

public final class CustomImmutableObject {
    private final String name;
    private final int age;
    private final Address address;

    public CustomImmutableObject(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        // Return a new Address object to maintain immutability if Address is mutable
        return new Address(address);
    }

    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield");
        CustomImmutableObject customImmutableObject = new CustomImmutableObject("shivam", 33, address);
        System.out.println(customImmutableObject.getName());
        System.out.println(customImmutableObject.getAge());
        System.out.println(customImmutableObject.getAddress().getStreet());
        System.out.println(customImmutableObject.getAddress().getCity());

    }
}

