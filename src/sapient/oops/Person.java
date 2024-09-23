package sapient.oops;

import java.util.Date;

public abstract class Person {
    String name;
    int age;
    Date dob;
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int age, Date dob, Address address) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
    }

    abstract void doEat();
    abstract void doSleep();
    abstract void doWork();
}
