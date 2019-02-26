package prWeek12.railFencer;

public class ToDown implements Step {
    @Override
    public Boolean isThereMore(Coordinate coordinate,String text,Integer numberOfRails) {
        return coordinate.getColumn()<text.length()&&coordinate.getRow()<numberOfRails;
    }

    @Override
    public Coordinate getNextCoordinate(Coordinate coordinate) {
        int newRow = coordinate.getRow() + 1;
        int newColumn = coordinate.getColumn() + 1;
        return new Coordinate(newRow, newColumn);
    }
}
