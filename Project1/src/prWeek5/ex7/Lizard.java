package prWeek5.ex7;

public class Lizard implements Move {
    @Override
    public String getName() {
        return "lizard";
    }

    @Override
    public Boolean defeats(Move move) {
        boolean move1 = "spock".equalsIgnoreCase(move.getName());
        boolean move2 = "paper".equalsIgnoreCase(move.getName());
        return move1 || move2;
    }
}
