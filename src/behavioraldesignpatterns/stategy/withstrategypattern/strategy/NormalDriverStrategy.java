package behavioraldesignpatterns.stategy.withstrategypattern.strategy;

public class NormalDriverStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive capability");
    }
}
