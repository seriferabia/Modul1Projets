package prWeek5.ex7;

import java.util.Optional;

public interface Player {
    Optional<Move> chooseMove();
    Boolean playAgain();
}
