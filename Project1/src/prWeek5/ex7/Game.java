package prWeek5.ex7;

public class Game {

    private Player player1 = new Human();
    private Player player2 = new Computer();
    private Judge judge = new Judge();

    public void play() {
        Boolean playAgain = true;
        while (playAgain) {
            playOneRound();
            playAgain = getPlayAgain();
        }
        System.out.println("See you next time!");
    }

    private void playOneRound() {
        displayMenu();
        Move move1 = player1.chooseMove().get();
        Move move2 = player2.chooseMove().get();
        displayAllAnswers(move1, move2);
        System.out.println(judge.decideWinner(move1, move2));
    }

    private Boolean getPlayAgain() {
        return player1.playAgain() && player2.playAgain();
    }

    public void displayMenu() {
        System.out.println("Let’s play rock, paper, scissors!");
    }

    private void displayAllAnswers(Move move1, Move move2) {
        System.out.println("Player1 choose : " + move1.getName());
        System.out.println("Player2 choose : " + move2.getName());
    }
}
