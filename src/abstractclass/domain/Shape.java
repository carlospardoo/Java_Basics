package abstractclass.domain;

public abstract class Shape {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public abstract void paint();

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }
}
