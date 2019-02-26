package Week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eva7 {
    public static void main(String[] args) {
        List<String> friends =getFriendNames();
        for (String name:friends ) {
            System.out.println(makeLabels(name));
        }

    }
    public static String makeLabels(String name){
        String label= "";
        int number = name.length()*2;
        char letter = name.charAt(1);

        label = label + letter + number;

        return label;
    }
    public static List<String> getFriendNames(){
        List<String> friends = Arrays.asList("Hala", "Diba", "Niklas", "Ashkan", "Hosam");
        friends = friends.stream().collect(Collectors.toList());
        return friends;
    }
}
