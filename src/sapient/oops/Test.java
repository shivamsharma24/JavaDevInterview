package sapient.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Address address= new Address("delhi",202012);

        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd MMM yyyy");
        Date dob = simpleDateFormat.parse("24 jul 1990");

        Driver driver= new Driver("JOhn",33,dob,address);
        System.out.println("Age of driver is "+ driver.getAge());
        driver.doEat();
        driver.doEat();
        driver.doSleep();

        Manager manager= new Manager("shivam",34,new Date(),address);
        manager.doSleep();
        manager.doEat();
        manager.doWork();
    }
}
