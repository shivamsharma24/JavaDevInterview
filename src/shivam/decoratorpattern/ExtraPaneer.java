package shivam.decoratorpattern;

import shivam.decoratorpattern.base.BasePizza;
import shivam.decoratorpattern.decorator.ToppingsDecorator;

public class ExtraPaneer extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraPaneer(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }
}
