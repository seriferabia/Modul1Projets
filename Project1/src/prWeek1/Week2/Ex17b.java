import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Ex17b {
    public static void main(String[] args) {

        Collection<String> words =  Arrays.asList("PLEASE", "NO", "ADVERTISEMENT");
        Collection<String> new_words = new ArrayList<>();


        for (String word : words) {
            word = word.toLowerCase();
            new_words.add(word);
        }

        System.out.println(new_words);
    }
}
