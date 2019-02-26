package prWeek10.ex1;

import prWeek9.FileReader;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokemonList {
    private FileReader fileReader = new FileReader();

    public List<Pokemon> getPokemonList(){
        return fileReader.asStream("prWeek10/source/pokemon.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(toPokemon())
                .collect(Collectors.toList());
    }

    private Function<String[],Pokemon> toPokemon() {
        return e -> new Pokemon(e[0],e[1],e[2],
                Integer.valueOf(e[3]),Integer.valueOf(e[5]),
                Integer.valueOf(e[6]),Integer.valueOf(e[9]),
                Integer.valueOf(e[10]), e[11]);
    }
}
