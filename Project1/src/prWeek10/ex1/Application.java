package prWeek10.ex1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    private static List<Pokemon> pokemonList = new PokemonList().getPokemonList();

    public static void main(String[] args) {
        System.out.println("List of all pokemons alphabetically ordered:");
        pokemonList.stream()
                .map(e->e.getName())
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Set of all type1: ");
        pokemonList.stream()
                .map(e->e.getType1())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("Numbers of pokemons with type1 is fire :");
        pokemonList.stream()
                .filter(e->e.getType1().equals("Fire"))
                .count();
        System.out.println("Is there any pokemon with type1 is fire and type2 is water: ");
        pokemonList.stream()
                .anyMatch(e->e.getType1().equals("Fire")&&e.getType2().equals("Water"));
    }
}
