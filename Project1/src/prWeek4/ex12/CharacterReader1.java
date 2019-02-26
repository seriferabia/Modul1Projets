package prWeek4.ex12;

import prWeek4.ex9.FileReader;

import java.util.*;


public class CharacterReader1 {
    private FileReader reader = new FileReader();

    public List<Character> getCharacters(String filePath){
        List<Character> characters = new ArrayList<>();
        List<String> lines = reader.getLines(filePath);
        lines.remove(0);
        for (String line : lines) {
            String[] split = line.split(";");
            String name = split[0];
            String bookOfDeath = split[3];
            String gender = split[6];
            Character character = new Character(name, bookOfDeath,gender);
            characters.add(character);
        }
        return characters;
    }


    public List<Character> getDeadCharacters(List<Character> characters){
        List<Character> deathCharacters = new ArrayList<>();
        for (Character character : characters) {
            if(!character.getBookOfDeath().isEmpty()){
                deathCharacters.add(character);
            }
        }
        return deathCharacters;
    }
    public List<Character> getDeadMen(List<Character> deadCharacters){
        List<Character> deadMen = new ArrayList<>();
        for (Character deadCharacter : deadCharacters) {
            if(deadCharacter.getGender().equals("1")){
                deadMen.add(deadCharacter);
            }
        }
        return deadMen;

    }
    public List<Character> getDeadWomen(List<Character> deadCharacters){
        List<Character> deadWomen = new ArrayList<>();
        for (Character deadCharacter : deadCharacters) {
            if(deadCharacter.getGender().equals("0")){
                deadWomen.add(deadCharacter);
            }
        }
        return deadWomen;
    }
    public Map<String, Integer> getNumberOfDeathInEachBook(List<Character> deadCharacters){
        Map<String, Integer> numberOfDeathInEachBook = new HashMap<>();
        for (Character deadCharacter : deadCharacters) {
            String keyBook = deadCharacter.getBookOfDeath();
            Integer numberOfDeathInOneBook = getNumberOfDeathInOneBook(keyBook,deadCharacters);
            numberOfDeathInEachBook.put(keyBook,numberOfDeathInOneBook);
        }
        return numberOfDeathInEachBook;
    }
    private Integer getNumberOfDeathInOneBook(String book,List<Character> deadCharacters){
        Integer numberOfDeathInOneBook = 0;
        for (Character possibility : deadCharacters) {
            if(book.equals(possibility.getBookOfDeath())){
                numberOfDeathInOneBook++;
            }
        }
        return  numberOfDeathInOneBook;
    }

    public String  getMostDeathfulBook(Map<String,Integer> books){
        Set<Map.Entry<String,Integer>> deathsInBooks = books.entrySet();
        Integer maximum = 0;
        String keyOfDeathfulBook ="";
        for (Map.Entry<String, Integer> deathsInBook : deathsInBooks) {
            if(deathsInBook.getValue()>maximum){
                maximum=deathsInBook.getValue();
                keyOfDeathfulBook = deathsInBook.getKey();
            }
        }
        return keyOfDeathfulBook;
    }
    public List<Character> getCharactersFormMostDeatfulBook(List<Character> deadCharacters){
        List<Character> charactersFormMostDeatfulBook  = new ArrayList<>();
        Map<String, Integer> numberOfDeathInEachBook = getNumberOfDeathInEachBook(deadCharacters);
        String mostDeathfulBook = getMostDeathfulBook(numberOfDeathInEachBook);
        for (Character deadCharacter : deadCharacters) {
            if(deadCharacter.getBookOfDeath().equals(mostDeathfulBook)){
                charactersFormMostDeatfulBook.add(deadCharacter);
            }
        }
        return charactersFormMostDeatfulBook;
    }
}

