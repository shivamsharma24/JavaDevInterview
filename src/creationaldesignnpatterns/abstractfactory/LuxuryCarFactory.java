package creationaldesignnpatterns.abstractfactory;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price >= 10000000)
            return new LuxuryCar1();
        else return new LuxuryCar2();
    }
}
