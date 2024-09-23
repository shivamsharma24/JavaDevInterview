package creationaldesignnpatterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer= new AbstractFactoryProducer();
        AbstractFactory economicfaAbstractFactory = factoryProducer.getFactoryInstance("Economic");
        Car car = economicfaAbstractFactory.getInstance(20000);
        System.out.println(car.speed());
    }
}
