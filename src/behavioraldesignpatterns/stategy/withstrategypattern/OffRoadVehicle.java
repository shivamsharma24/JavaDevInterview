package behavioraldesignpatterns.stategy.withstrategypattern;

import behavioraldesignpatterns.stategy.withstrategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}
