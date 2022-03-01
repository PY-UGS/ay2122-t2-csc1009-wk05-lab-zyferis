public class Circle extends Shape {
    public Circle() {
        super();
    }

    public Circle(double dim1,double dim2) {
        super(dim1,dim2);
    }

    @Override
    public double area() {
        return super.getPi() * super.getDim1() * super.getDim2();
    }

}
