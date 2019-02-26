package prWeek5.ex1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class CircleTest {

    @Test
    void testCircle() {
        String expected = "Circle";
        Circle circle = new Circle();
        String result = circle.getName();
        Assertions.assertEquals(expected,result);

    }
    @Test
    void testShape(){
        String expected = "Circle";
        Shape shapeCircle = new Circle();
        String result2 = shapeCircle.getName();
        Assertions.assertEquals(expected,result2);
    }

}