package prWeek5.ex4;


import prWeek5.ex5.Villain;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "Spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(this.getName());
    }
}
