package behavioraldesignpatterns.stategy.withstrategypattern;

import behavioraldesignpatterns.stategy.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
