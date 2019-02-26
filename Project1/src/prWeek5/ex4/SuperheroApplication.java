package prWeek5.ex4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero superhero = superheroCaller.call();
        System.out.println("Superhero : " + superhero.getName());
        List<Superhero> heros = new ArrayList<>();
        for (int times = 0; times < 6; times++) {
            heros.add(superheroCaller.call());
        }
        for (int times = 1; times <= 6; times++) {
            System.out.println("Superhore " + times + ": " + heros.get(times-1).getName());
        }
        System.out.println("Number of superheroes: " + heros.size());
    }
}
