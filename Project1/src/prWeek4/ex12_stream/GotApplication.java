package prWeek4.ex12_stream;



import java.util.List;
import java.util.Map;

public class GotApplication {

    public static void main(String[] args) {
        CharacterReader characterReader = new CharacterReader();
        List<Character> characters = characterReader.getCharacters("prWeek4/ex12/got-characters.csv");
        System.out.println("Number of characters : " +characters.size());
        List<Character> deadCharacters = characterReader.getDeadCharacters(characters);
        System.out.println("Number of dead characters : " + deadCharacters.size());
        List<Character> deadMen = characterReader.getDeadMen(deadCharacters);
        List<Character> deadWomen = characterReader.getDeadWomen(deadCharacters);
        System.out.println("Dead men : "+ deadMen.size() + " | Dead women : " + deadWomen.size());
        Integer menPercentage = Integer.valueOf(deadMen.size()*100/deadCharacters.size());
        Integer womenPercentage = Integer.valueOf(deadWomen.size()*100/deadCharacters.size());
        System.out.println("Dead men percentage : " + menPercentage+"% | Dead women percentage : "+womenPercentage+"%");
        Map<String, Long> numberOfDeathInEachBook = characterReader.getNumberOfDeathInEachBook(deadCharacters);
        System.out.println("Number of deaths in each book : " +numberOfDeathInEachBook);
        Map.Entry<String,Long> mostDeathfulBook = characterReader.getMostDeathfulBook(numberOfDeathInEachBook);
        System.out.println("Book with the most dead counts is book "+ mostDeathfulBook.getKey()+" with "+ mostDeathfulBook.getValue()+" deaths.");
        System.out.println("Characters who died in book number " + mostDeathfulBook.getKey()+" :");
        List<Character> charactersFormMostDeatfulBook = characterReader.getCharactersFormMostDeatfulBook(deadCharacters);
        charactersFormMostDeatfulBook.forEach(System.out::println);


    }
}
