package Week4;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> words1 = Ex5.getCollection1();
        List<String> words2 = Ex5.getCollection2();
        List<String> concatenated = concatenate(words1, words2);
        System.out.println(concatenated);
    }

    private static List<String> concatenate(List<String> one, List<String> two) {
        for (String word: two ) {
            one.add(word);
        }
        return one;
    }

}
