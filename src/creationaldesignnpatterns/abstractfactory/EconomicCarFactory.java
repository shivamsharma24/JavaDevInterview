package creationaldesignnpatterns.abstractfactory;

public class EconomicCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price <= 3000000)
            return new EconomicCar1();
        else return new EconomicCar2();
    }
}
