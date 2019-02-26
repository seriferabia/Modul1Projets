package prWeek5.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Moves {
    private static List<Move> moves = Arrays.asList(new Rock(),new Paper(), new Scissors(),new Lizard(),new Spock());

    public static List<Move> getMoves(){
        return moves;
    }

//    public static String asString(){
//        String allMoves = "";
//        for (Move move : moves) {
//            allMoves+=move.getName()+" ";
//        }
//        return allMoves;
//    }
    public static String asString(){
        return moves.stream().map(e-> e.getName()).collect(Collectors.joining(" "));
    }

}
