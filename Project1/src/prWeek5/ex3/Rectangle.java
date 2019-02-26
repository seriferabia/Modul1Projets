package prWeek5.ex3;


import prWeek5.ex1.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {
        return "Rose";
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getColor() +" "+ getName();
    }
}
