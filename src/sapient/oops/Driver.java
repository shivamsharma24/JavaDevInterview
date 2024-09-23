package sapient.oops;

import java.util.Date;

public class Driver extends Person{

    @Override
    void doEat() {
        System.out.println("Driver is eating");
    }

    @Override
    void doSleep() {
        System.out.println("Driver is sleeping");

    }

    @Override
    void doWork() {
        System.out.println("Driver is working");

    }

    public Driver(String name, int age, Date dob, Address address){
        super(name,age,dob,address);
    }
}
