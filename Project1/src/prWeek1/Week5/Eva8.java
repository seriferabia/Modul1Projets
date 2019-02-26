package Week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static Week5.Eva7.getFriendNames;

public class Eva8 {
    public static void main(String[] args) {
        List<String> players = getFriendNames();
        List<String> cardNames = getCardNames();
        int player = 0;
        int length = players.size();
        while(cardNames.size()>0){
            String name = players.get(player);
            String  card = cardNames.get(0);
            System.out.println(doTruthOrDare(name, card));
            cardNames.remove(0);
            player = (player+1)%length;

        }
    }

    private static List<String> getCardNames() {
        List<String> cards = Arrays.asList("red","red","black","red","black","red","black","black","red");
        cards = cards.stream().collect(Collectors.toList());
        return cards;
    }
    public static String doTruthOrDare(String name, String card){
        if(card.equals("red")){
            return name + " has to say a truth.";
        }else{
             return name + " has to perform a dare.";
        }

    }
}
