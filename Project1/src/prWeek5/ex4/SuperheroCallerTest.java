package prWeek5.ex4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {
    private SuperheroCaller superheroCaller = new SuperheroCaller();
    private List<String> heroes = Arrays.asList(new Batman().getName(), new Superman().getName(), new Spiderman().getName());


    @Test
    void testNull() {
        Superhero result = superheroCaller.call();
        assertNotNull(result);
    }

    @Test
    void testHeroList() {
        Superhero hero = superheroCaller.call();
        String result = hero.getName();
        List<String> superheroes = new ArrayList<>(heroes);
        assertTrue(superheroes.contains(result));

    }
}