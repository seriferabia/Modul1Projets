package prWeek5.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Human implements Player {
    private Scanner scanner = new Scanner(System.in);
    private List<Move> moves = Moves.getMoves();

    @Override
    public Optional<Move> chooseMove() {
        Optional<Move> choice = Optional.empty();
        while(!choice.isPresent()){
            showChoices();
            String moveName=scanner.nextLine();
            for (Move move : moves) {
                if(isValid(move,moveName)){
                    choice = Optional.of(move);
                    return choice;
                }
            }

        }

        return Optional.empty();
    }

    private boolean isValid(Move move,String moveName) {
       return move.getName().equalsIgnoreCase(moveName);
    }

    public void showChoices() {
        System.out.println("These are your options: " + Moves.asString());
        System.out.println("Choose one :");
    }

    @Override
    public Boolean playAgain() {
        System.out.println("Do you want play again? (yes/no)");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("yes");

    }
}
