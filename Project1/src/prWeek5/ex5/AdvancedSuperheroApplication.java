package prWeek5.ex5;


import prWeek5.ex4.Superhero;
import prWeek5.ex4.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Villain joker = new Joker();
        for (int times = 0; times < 10; times++) {
            Superhero superhero = superheroCaller.call();
            superhero.fight(joker);
        }

    }
}
