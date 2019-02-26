package prWeek5.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prWeek5.ex1.Shape;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testColorOfRectangle() {
        String expected = "Rose";
        Rectangle rectangle = new Rectangle();
        String resultForColor = rectangle.getColor();
        Assertions.assertEquals(expected,resultForColor);
    }
    @Test
    void testColorOfColored() {
        String expected = "Rose";
        Colored colored = new Rectangle();
        String resultForColor = colored.getColor();
        Assertions.assertEquals(expected,resultForColor);
    }

    @Test
    void testNameOfRectangle() {
        String expected = "Rectangle";
        Rectangle rectangle = new Rectangle();
        String resultForName= rectangle.getName();
        Assertions.assertEquals(expected,resultForName);
    }

    @Test
    void testNameOfShaped() {
        String expected = "Rectangle";
        Shape shaped = new Rectangle();
        String resultForName= shaped.getName();
        Assertions.assertEquals(expected,resultForName);
    }

}