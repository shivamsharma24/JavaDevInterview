package behavioraldesignpatterns.stategy.withstrategypattern;

public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        Vehicle vehicle1=new GoodsVehicle();
        vehicle1.drive();
    }
}
