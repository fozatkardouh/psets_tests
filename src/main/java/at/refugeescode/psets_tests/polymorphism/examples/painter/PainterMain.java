package main.polymorphism.examples.painter;

import main.polymorphism.examples.painter.*;

public class PainterMain {

    public static void main(String[] args) {
        // normal instantiation
        Painter painter = new Painter();

        // abstract instantiation - Red is casted to Colour as soon as it is created
        Colour colour = new Red();
        painter.paint(colour);

        // the colour gets replaced by Yellow and the painter doesn't realize
        colour = new Yellow();
        painter.paint(colour);

        // painter uses abstraction in order to paint any colour
        // colours use polymorphism in order to say different colours depending
        // on their implementation (getName) is using polymorphism

        painter.paint(new Square());
        Shape shape = new Circle();
        painter.paint(shape);
        painter.paint(new Triangle());




    }


}
