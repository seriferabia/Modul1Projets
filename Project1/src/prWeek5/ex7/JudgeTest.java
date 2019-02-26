package prWeek5.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {
    private Move paper = new Paper();
    private Move rock = new Rock();
    private Move scissors = new Scissors();
    private Judge judge = new Judge();

    @Test
    void testPaperRock(){
        String decision = judge.decideWinner(paper, rock);
        String expected = "Player1 wins !";
        Assertions.assertEquals(expected,decision);
    }
    @Test
    void testPaperScissors(){
        String decision = judge.decideWinner(paper, scissors);
        String expected = "Player2 wins !";
        Assertions.assertEquals(expected,decision);
    }
    @Test
    void testPaperPaper(){
        String decision = judge.decideWinner(paper, paper);
        String expected = "No Winner!";
        Assertions.assertEquals(expected,decision);
    }

}