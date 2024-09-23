package creationaldesignnpatterns.abstractfactory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String input) {
        switch (input) {
            case "Economic":
                return new EconomicCarFactory();
            case "Luxury":
                return new LuxuryCarFactory();
            default:
                return null;
        }
    }
}
