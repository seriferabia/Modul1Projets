package prWeek5.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    private List<Superhero> superheroes = Arrays.asList(new Batman(),new Superman(),new Spiderman());
    private Random random = new Random();

    public Superhero call(){
        Integer position = random.nextInt(3);
        return superheroes.get(position);
    }
}
