package sapient.oops;

import java.util.Date;

public class Manager extends Person{

    @Override
    void doEat() {
        System.out.println("Manager is eating");
    }

    @Override
    void doSleep() {
        System.out.println("Manager is sleeping");

    }

    @Override
    void doWork() {
        System.out.println("Manager is working");

    }

    public Manager(String name, int age, Date dob, Address address){
        super(name,age,dob,address);
    }
}
