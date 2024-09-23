package behavioraldesignpatterns.stategy.withstrategypattern;

import behavioraldesignpatterns.stategy.withstrategypattern.strategy.NormalDriverStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(){
        super(new NormalDriverStrategy());
    }


}
