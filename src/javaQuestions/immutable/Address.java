package javaQuestions.immutable;

//This is mutable class
public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address(Address address) {
        this(address.getStreet(), address.getCity());
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
