package shivam.diamondProblem;

public class MyClass implements Interface1,Interface2{

    @Override
    public void display() {
        Interface1.super.display();
        Interface2.super.display();
    }
}
