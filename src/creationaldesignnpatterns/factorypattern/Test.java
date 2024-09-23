package creationaldesignnpatterns.factorypattern;

public class
Test {
    public static void main(String[] args) {

        ShapeFactory shapeFactory= new ShapeFactory();
        Shape obj = shapeFactory.getShape("CIRCLE");
        obj.draw();

    }
}
