package prWeek7.ex10;


import java.util.List;

public class AnagramApplication {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        List<String> anagrams = anagram.getAnagramsFor("centimo", "dung");
        System.out.println("Two-word anagram combinations for the word documenting");
        System.out.println("Number of combinations: "+anagrams.size());
        anagrams.stream()
                .forEach(e->System.out.println("Possible combination: "+ e));
    }
}
