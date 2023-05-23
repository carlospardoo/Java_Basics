package abstractclass.domain;

public class Rectangle extends Shape{

    public Rectangle(String shapeType) {
        super(shapeType);
    }

    @Override
    public void paint() {
        System.out.println("Dibujando la figura: "+this.getClass().getSimpleName());
    }
}
