package javapatterns.Creational.FactoryPattern;

/**
 * Created by hoangtd on 2/21/2017.
 */
public class ShapeFactory {

    public Shape getShape(String typeShape) {
        if (typeShape == null) {
            return null;
        }

        if ("CIRCLE".equalsIgnoreCase(typeShape)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(typeShape)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(typeShape)) {
            return new Square();
        }

        return null;
    }
}
