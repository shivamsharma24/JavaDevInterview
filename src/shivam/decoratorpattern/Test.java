package shivam.decoratorpattern;

import shivam.decoratorpattern.base.Farmhouse;

public class Test {
    public static void main(String[] args) {
        //Using decorator pattern
        ExtraCheese extraCheese = new ExtraCheese(new ExtraPaneer(new Farmhouse()));
        System.out.println(extraCheese.cost());
    }
}
