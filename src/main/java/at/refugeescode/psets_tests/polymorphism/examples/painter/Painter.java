package main.polymorphism.examples.painter;

public class Painter {

    public void paint(Colour colour) {
        System.out.println("I will paint this colour: " + colour.getName());
    }

    // Colour != Square
    // now the painter's method "paint" is using polymorphism
    public Integer paint(Square square) {
        System.out.println("I will paint a square");
        return null;
    }

    public void paint(Shape shape) {
        System.out.println("I will paint this shape: " + shape.getName());
    }

    public String paint(Circle circle) {
        System.out.println("I will paint a circle");
        return null;
    }
}
