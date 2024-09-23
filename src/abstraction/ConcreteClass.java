package abstraction;

public class ConcreteClass extends AbstractClassC{

    //Achieving Full Abstraction via the Interface chain
    public static void main(String[] args) {
        ConcreteClass concreteClass= new ConcreteClass();
        concreteClass.m1();
        concreteClass.m2();
        concreteClass.m3();
    }
}
