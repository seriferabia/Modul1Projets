package prWeek10.ex4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GOTBookStatistic {
    private List<Character> characterList = new CharacterList().characterList();

    public Integer getTotalAmountOfCharacters() {
        return characterList.size();
    }

    public List<Character> getDeathCharacters() {
        return characterList.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.toList());
    }

    public void displayPercentageOfDeathMenAndDeathWomen() {
        long deathWomen = getDeathCharacters().stream()
                .filter(e -> e.getGender().equals("0"))
                .count();
        int numberOfDeathCharacters = getDeathCharacters().size();
        long deathMen = numberOfDeathCharacters - deathWomen;

        System.out.println("Percentage of death women: " + deathWomen * 100 / numberOfDeathCharacters);
        System.out.println("Percentage of death men: " + deathMen * 100 / numberOfDeathCharacters);
    }

    public Map.Entry<String, Long> mostDreadfulBook() {
        return characterList.stream()
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst().get();
    }

    public List<Character> getDeathCharactersWhoDiedInTheMostDreadfulBook() {
        return characterList.stream()
                .filter(e -> e.getBookOfDeath().equals(mostDreadfulBook().getKey()))
                .collect(Collectors.toList());
    }

    public List<String> getTwoAllegiancesThatHaveTheBiggestDeathCount() {
        return getDeathCharacters().stream()
                .collect(Collectors.groupingBy(e -> e.getAllegiances(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }

    public Long percentageOfDeathNobelCharacters() {
        long deathNobelCharacters = getDeathCharacters().stream()
                .filter(e -> e.getNobility().equals("1"))
                .count();
        return deathNobelCharacters * 100 / getDeathCharacters().size();

    }

    public String deathBookOfAllegiance(String allegiance){
        return getDeathCharacters().stream()
                .filter(e->e.getAllegiances().equals(allegiance))
                .collect(Collectors.groupingBy(e->e.getBookOfDeath(),Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst().get().getKey();

    }

    public Long getDeathNumberFromAllegiance(String allegiance){
        return getDeathCharacters().stream()
                .filter(e->e.getAllegiances().equals(allegiance))
                .count();
    }

    public Boolean isThereAliveCharacter(){
        return characterList.stream()
                .anyMatch(e->e.getBookOfDeath().isEmpty());
    }

    public Boolean hasBeenKilledInTheSameChapterGotIntroduced(){
        return getDeathCharacters().stream()
                .anyMatch(e->e.getDeathChapter().equals(e.getBookIntroChapter()));
    }


}
