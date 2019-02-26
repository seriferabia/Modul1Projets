package prWeek12.railFencer;

public interface Step {
    Boolean isThereMore(Coordinate coordinate,String text, Integer numberOfRails);
    Coordinate getNextCoordinate(Coordinate coordinate);
}
