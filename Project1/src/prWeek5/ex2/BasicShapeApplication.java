package prWeek5.ex2;


import prWeek5.ex1.Circle;
import prWeek5.ex1.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShapeApplication {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Shape : " + circle.getName());
        Shape square = new Square();
        System.out.println("Shape : " + square.getName());
        Shape triangle = new Triangle();
        System.out.println("Shape : " + triangle.getName());
        List<Shape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(circle, square, triangle));
        System.out.println("Shapes : " + shapes);
        for (Shape shape : shapes) {
            System.out.println("Shape : " + shape);
        }

    }
}
