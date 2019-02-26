package prWeek5.ex2;

import prWeek5.ex1.Shape;

public class Square implements Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
