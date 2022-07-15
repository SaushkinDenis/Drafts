package SberEducation.Objects;

public class Rectangle {
    double weight = -1;
    double height = -1;

    public Rectangle(){}

    public Rectangle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getArea(){
        return this.weight*height;
    }

    public double getPerimeter(){
        return 2*(this.weight + this.height);
    }
}


