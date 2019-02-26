package prWeek5.ex3;

import prWeek5.ex1.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color of rectangle : " + rectangle.getColor());
        System.out.println("Name : " + rectangle.getName());
        Colored colored = (Colored) rectangle;
        System.out.println("Color of colored object : " + colored.getColor());
        Shape shaped = (Shape) rectangle;
        System.out.println("Name of colored object : " + shaped.getName());
        List<Rectangle> rectangles = Arrays.asList(rectangle);
        List<Colored> coloreds = Arrays.asList(rectangle,colored);
        List<Shape> shapes = Arrays.asList(rectangle,shaped);
        System.out.println("List of rectangles : " + rectangles);
        System.out.println("List of coloreds : " + coloreds);
        System.out.println("List of shapes : " + shapes);


    }
}
