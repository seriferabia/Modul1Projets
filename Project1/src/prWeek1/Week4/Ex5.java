package Week4;
import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<String> words1 = getCollection1();
        List<String> words2 = getCollection2();

        List<String> collection = combine(words1, words2);

        System.out.println(collection);


    }

    public static List<String> getCollection1() {
        List<String> words1 = new ArrayList<>();
        words1.add("cat");
        words1.add("dog");
        words1.add("bird");
        return words1;
    }

    public static List<String> getCollection2() {
        List<String> words2 = new ArrayList<>();
        words2.add("table");
        words2.add("chair");
        words2.add("lamp");
        return words2;
    }

    public static List<String> combine(List<String> words1, List<String> words2){

        List<String> combined = new ArrayList<String>();

        while(areThereElement(words1, words2)) {
            transfer(words1, combined);
            transfer(words2, combined);
        }
        return combined;

    }

    private static void transfer(List<String> origin, List<String> destination) {
        if(origin.isEmpty()){
            return;
        }
        String first = origin.get(0);
        origin.remove(0);
        destination.add(first);

    }

    private static boolean areThereElement(List<String> words1, List<String> words2) {
        return !words1.isEmpty() || !words2.isEmpty();
    }
}

