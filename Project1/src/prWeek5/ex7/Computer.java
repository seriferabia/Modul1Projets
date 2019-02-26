package prWeek5.ex7;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Computer implements Player {
    private List<Move> moves = Moves.getMoves();


    @Override
    public Optional<Move> chooseMove() {
        Random random = new Random();
        int position = random.nextInt(moves.size());
        return Optional.of(moves.get(position));
    }

    @Override
    public Boolean playAgain() {
        return true;
    }
}