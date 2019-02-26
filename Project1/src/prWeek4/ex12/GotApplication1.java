package prWeek4.ex12;

import java.util.List;
import java.util.Map;

public class GotApplication1 {

    public static void main(String[] args) {
        CharacterReader1 characterReader1 = new CharacterReader1();
        List<Character> characters = characterReader1.getCharacters("prWeek4/ex12/got-characters.csv");
        System.out.println("Number of characters : " +characters.size());
        List<Character> deadCharacters = characterReader1.getDeadCharacters(characters);
        System.out.println("Number of dead characters : " + deadCharacters.size());
        List<Character> deadMen = characterReader1.getDeadMen(deadCharacters);
        List<Character> deadWomen = characterReader1.getDeadWomen(deadCharacters);
        System.out.println("Dead men : "+ deadMen.size() + " | Dead women : " + deadWomen.size());
        Integer menPercentage = Integer.valueOf(deadMen.size()*100/deadCharacters.size());
        Integer womenPercentage = Integer.valueOf(deadWomen.size()*100/deadCharacters.size());
        System.out.println("Dead men percentage : " + menPercentage+"% | Dead women percentage : "+womenPercentage+"%");
        Map<String, Integer> numberOfDeathInEachBook = characterReader1.getNumberOfDeathInEachBook(deadCharacters);
        System.out.println("Number of deaths in each book : " +numberOfDeathInEachBook);
        String mostDeathfulBook = characterReader1.getMostDeathfulBook(numberOfDeathInEachBook);
        System.out.println("Book with the most dead counts is book "+ mostDeathfulBook+" with "+ numberOfDeathInEachBook.get(mostDeathfulBook)+" deaths.");
        System.out.println("Characters who died in book number " + mostDeathfulBook+" :");
        List<Character> charactersFormMostDeatfulBook = characterReader1.getCharactersFormMostDeatfulBook(deadCharacters);
        charactersFormMostDeatfulBook.forEach(System.out::println);


    }
}
