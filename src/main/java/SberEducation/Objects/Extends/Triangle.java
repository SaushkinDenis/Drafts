package SberEducation.Objects.Extends;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean isFilled){
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        return Math.sqrt(getHalfPerimeter() * (getHalfPerimeter() - getSide1()) * (getHalfPerimeter() - getSide2()) * (getHalfPerimeter() - getSide3()));
    }

    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }

    double getHalfPerimeter(){
        return getPerimeter() / 2;
    }

    @Override
    public String toString(){
        return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
                " сторона3 = " + side3 + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + super.toString();
    }
}
