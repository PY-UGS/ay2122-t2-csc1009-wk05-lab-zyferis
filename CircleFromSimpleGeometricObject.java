public class CircleFromSimpleGeometricObject extends GeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {
        super();
    }

    public CircleFromSimpleGeometricObject(double radius) {
        super();
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public double getDiameter() {
        return radius*2;
    }


    public void printCircle() {
        System.out.println("Circle [radius=" + radius + "colour=" + super.getColour() + ", dateCreated=" + super.getDateCreated() + ", filled=" + super.isFilled() +"]");
    }
}
