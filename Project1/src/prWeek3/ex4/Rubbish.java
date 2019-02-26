package prWeek3.ex4;

import java.util.*;
import java.util.stream.Collectors;

public class Rubbish {

    private String rubbish = "!@#$%&*+-=";
    private String[] rubbishs = rubbish.split("");
    private List<String> rubbishes = new ArrayList<String>(Arrays.asList(rubbishs));

    public String addRubbishSymbol(String message){

        String newMessage = "";

        Random random = new Random();

        String[] letters = message.split("");
        for(String letter : letters){
            newMessage += letter;
            Integer randomNumber = random.nextInt(5)+1;
            for (int i=0; i < randomNumber; i++){
                newMessage += getRubbishSymbol();
            }
        } return newMessage;


    }
    private String getRubbishSymbol(){
        Collections.shuffle(rubbishes);
        return rubbishes.get(0);
    }

    public String removeRubbish(String message){
        String newMessage = "";
        String[] letters = message.split("");
        List<String> messageLetters = new ArrayList<String>(Arrays.asList(letters));
        for(String letter : letters){
            if(rubbishes.contains(letter)){
                messageLetters.remove(letter);
            }
        }
        for(String letter : messageLetters){
            newMessage += letter;
        }
        return newMessage;
    }
}
