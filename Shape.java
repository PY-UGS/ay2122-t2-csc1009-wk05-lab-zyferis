public abstract class Shape {
    private double dim1, dim2;
    private static final double PI = 3.14;

    public Shape() {

    }

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public abstract double area();

    public static double getPi() {
        return PI;
    }

}