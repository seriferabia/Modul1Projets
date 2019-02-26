package prWeek5.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prWeek5.ex1.Shape;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testSquare() {
        String expected = "Square";
        Square square = new Square();
        String result = square.getName();
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testShape() {
        String expected = "Square";
        Shape square = new Square();
        String result = square.getName();
        Assertions.assertEquals(expected,result);
    }
}