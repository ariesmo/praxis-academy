package Prototype;

import java.util.Hashtable;

import Prototype.Circle;
import Prototype.Rectangle;
import Prototype.Shape;
import Prototype.Square;

public class ShapeCache {
    private static Hashtable<String, Shape> ShapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = ShapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query dan create shape
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        ShapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        ShapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        ShapeMap.put(rectangle.getId(), rectangle);
    }

}