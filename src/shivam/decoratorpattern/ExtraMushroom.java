package shivam.decoratorpattern;

import shivam.decoratorpattern.base.BasePizza;
import shivam.decoratorpattern.decorator.ToppingsDecorator;

public class ExtraMushroom extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
