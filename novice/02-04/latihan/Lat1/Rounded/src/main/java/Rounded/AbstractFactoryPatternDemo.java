package Rounded;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // get an object of Shape Rounded Rectangle and call draw() method
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        // get an object of Shape Rounded Rectangle and call draw() method
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        // get Rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        // get an object of Shape Rectangle and call draw() method
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        // get an object of Shape Rectangle and call draw() method
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}