package SberEducation.Objects.Extends;

import java.util.Scanner;

public class TestTriangle {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TestTriangle testTriangle = new TestTriangle();

        System.out.println("Create triangle");
        System.out.print("Side 1:");
        double side1 = testTriangle.scanner.nextDouble();
        System.out.print("Side 1:");
        double side2 = testTriangle.scanner.nextDouble();
        System.out.print("Side 1:");
        double side3 = testTriangle.scanner.nextDouble();

        System.out.print("Color:");
        String color = testTriangle.scanner.next();
        System.out.print("is Filled:");
        boolean isFilled = testTriangle.scanner.nextBoolean();

        GeometricObject triangle = new Triangle(side1, side2, side3, color, isFilled);
        System.out.println(triangle);
    }

}
