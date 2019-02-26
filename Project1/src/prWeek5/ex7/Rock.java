package prWeek5.ex7;

public class Rock implements Move {
    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public Boolean defeats(Move move) {
        boolean move1 = "scissors".equalsIgnoreCase(move.getName());
        boolean move2 = "lizard".equalsIgnoreCase(move.getName());
        return move1 || move2;
    }
}
