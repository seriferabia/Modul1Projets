package prWeek3.groupEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caesar {
    private LetterShifter letterShifter = new LetterShifter();

    public String encrypt(String message, Integer key){
        List<String> newLetters = new ArrayList<>();
        String[] letters0 = message.split("");
        List<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList(letters0));

        for (String letter : letters){
            int valueOfLetter = letter.charAt(0);
            if(Character.isAlphabetic(valueOfLetter)) {
                String newLetter = letterShifter.shift(letter, key);
                newLetters.add(newLetter);
            }else{
                newLetters.add(letter);
            }
        }
        String newMessage = String.join("",newLetters); //combineLetter(newLetters);
        return newMessage;
    }

//    private String combineLetter(List<String> newLetters) {
//        String newMessage = "";
//        for (String letter : newLetters){
//            newMessage += letter.toString();
//        }
//        return newMessage;
//    }



}
