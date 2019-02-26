package prWeek10.ex4;

import prWeek9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterList {
    private FileReader fileReader = new FileReader();

    public List<Character> characterList(){
        return fileReader.asStream("prWeek10/source/got-characters.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e->new Character(e[0],e[1],e[3],
                        e[4],e[5],e[6],e[7]))
                .collect(Collectors.toList());
    }
}
