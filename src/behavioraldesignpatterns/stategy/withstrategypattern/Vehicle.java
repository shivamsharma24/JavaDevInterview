package behavioraldesignpatterns.stategy.withstrategypattern;

import behavioraldesignpatterns.stategy.withstrategypattern.strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
