package prWeek5.ex1;

public class CircleAppliction {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Class : " + circle.getName());
        Shape shape = circle;
        System.out.println("Shape : " + shape.getName());
        Shape anotherShape = new Circle();
        System.out.println("Another shape : " + anotherShape.getName());
    }
}
