package prWeek5.ex7;

public class Judge {
    public String decideWinner(Move move1, Move move2){
        if (move1.defeats(move2)){
            return "Player1 wins !";
        }
        if(move2.defeats(move1)){
            return "Player2 wins !";

        }
        return "No Winner!";
    }

}
