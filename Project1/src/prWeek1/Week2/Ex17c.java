import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex17c {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");

        words.replaceAll(String::toLowerCase);
//        int size = words.size();
//        for (int i=0; i<size; i++) {
//            String word = words.get(0).toLowerCase();
//            words.add(word);
//            words.remove(0);
//        }

        System.out.println(words);
    }
}
