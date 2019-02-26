package prWeek5.ex2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prWeek5.ex1.Shape;

class TriangleTest {

    @Test
    void testTriangle() {
        String expected = "Triangle";
        Triangle triangle = new Triangle();
        String result = triangle.getName();
        Assertions.assertEquals(expected,result);
    }

    @Test
    void testShape() {
        String expected = "Triangle";
        Shape triangle = new Triangle();
        String result = triangle.getName();
        Assertions.assertEquals(expected,result);
    }
}