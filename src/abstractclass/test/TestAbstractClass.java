package abstractclass.test;

import abstractclass.domain.Shape;
import abstractclass.domain.Rectangle;

public class TestAbstractClass {
    public static void main(String[] args) {
//        Shape shape = new Shape();

        Shape shape = new Rectangle("Rectangulo");

        shape.paint();

    }
}
