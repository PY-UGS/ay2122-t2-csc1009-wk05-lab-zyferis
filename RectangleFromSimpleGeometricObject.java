public class RectangleFromSimpleGeometricObject extends GeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {
        super();
    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject(double width, double height, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return width*2 + height*2;
    }
}
