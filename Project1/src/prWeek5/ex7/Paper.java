package prWeek5.ex7;

public class Paper implements Move {
    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public Boolean defeats(Move move) {
        boolean move1 = "rock".equalsIgnoreCase(move.getName());
        boolean move2 = "spock".equalsIgnoreCase(move.getName());
        return move1 || move2;
    }
}
