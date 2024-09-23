package behavioraldesignpatterns.stategy.withoutstrategypattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
