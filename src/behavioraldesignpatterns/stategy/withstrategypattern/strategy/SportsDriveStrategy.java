package behavioraldesignpatterns.stategy.withstrategypattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special Drive capability");
    }
}
