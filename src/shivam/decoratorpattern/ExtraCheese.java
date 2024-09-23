package shivam.decoratorpattern;

import shivam.decoratorpattern.base.BasePizza;
import shivam.decoratorpattern.decorator.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
