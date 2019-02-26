package Week3;
import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("right");
        words.add("right");
        words.add("serife");
        words.add("rabia");
        words.add("bayramoglu");
        words.add("erguner");
        System.out.println(words);

        List<String> shifted = new ArrayList<>();
        shifted = shiftRight(words);
        System.out.println(shifted);

    }

    public static Boolean isRight(String word){
        return word.equalsIgnoreCase("right");
    }

    public static Boolean isLeft(String word){
        return word.equalsIgnoreCase("left");
    }

    public static List<String> shiftRight(List<String> words){
        List<String> shifted = new ArrayList<>();

        while(words.size()>0){
            String word = words.get(0);
            words.remove(0);
            if(isRight(word) && words.size()>0){
                String nextWord = words.get(0);
                words.remove(0);
                shifted.add(nextWord);
            }
            shifted.add(word);
        }
        return shifted;
    }
}
