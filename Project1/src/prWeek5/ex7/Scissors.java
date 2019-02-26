package prWeek5.ex7;

public class Scissors implements Move {
    @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public Boolean defeats(Move move) {
        boolean move1 = "paper".equalsIgnoreCase(move.getName());
        boolean move2 = "lizard".equalsIgnoreCase(move.getName());
        return move1 || move2;
    }
}
