package Week4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eva3 {
    public static void main(String[] args) {
        List<String> words = getAList();
        System.out.println(words);
        List<String> backwards = new ArrayList<>();
        for (String word:words ) {
            backwards.add(writeBackwards(word));
        }
        System.out.println(backwards);

    }

    public static List<String> getAList() {
//        List<String> words = new ArrayList<>();
//        words.add("lying about in bed never bought anyone fame");
//        words.add("you got to get up and work");
//        return words;
        List<String> words = Arrays.asList("Reflection","Collection","Stream");
        List<String> listOfWords = words.stream().collect(Collectors.toList());
        return listOfWords;


    }

    public static String writeBackwards(String word) {
        String backwards="";
        for (int i = word.length()-1; i>=0; i--){
            backwards =backwards+ word.charAt(i);
        }

        return backwards;
    }

}
