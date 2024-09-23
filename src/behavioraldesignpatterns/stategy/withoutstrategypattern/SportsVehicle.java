package behavioraldesignpatterns.stategy.withoutstrategypattern;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
