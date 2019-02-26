package Week4;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> collection = Main.getRandomNumbers(8);
        List<Integer> reversed = reverse(collection);
        System.out.println(collection);
        System.out.println(reversed);


    }
    public static List<Integer> reverse(List<Integer> collection){

        List<Integer> reversed = new ArrayList<>();

        for (int i = collection.size()-1; i >=0 ; i--) {
            reversed.add(collection.get(i));
        }
        return reversed;
    }
}