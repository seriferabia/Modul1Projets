package prWeek3.ex4;

import java.util.*;

public class NumberChanger1 {

    public String encryptNumber(String message){
        String[] letters = message.split("");
        String newMessage = "";
        for (String letter : letters){
            if (isNumeric(letter)) {
                Map digitToWord = initializeMap().get(0);
                String word = (String) digitToWord.get(letter);
                letter = word;
            }
            newMessage = newMessage + letter;
        }
        return newMessage;
    }

    private boolean isNumeric(String letter) {
        return letter.matches("\\d");
    }

    public List<Map> initializeMap(){
        Map<String, String> digitToWord= new HashMap<>();
        Map<String, String> wordToDigit= new HashMap<>();

        List<String> digits0 = Arrays.asList("0123456789".split(""));
        List<String> digits = new ArrayList<>(digits0);

        List<String> words0 = Arrays.asList("zero,one,two,three,four,five,six,seven,eight,nine".split(","));
        List<String> words = new ArrayList<>(words0);

        int times = digits.size();
        for(int pos = 0; pos < times; pos++){
            String digit = digits.get(pos);
            String word = words.get(pos);
            digitToWord.put(digit,word);
            wordToDigit.put(word,digit);
        }

        List<Map> checkingMaps = new ArrayList<>();
        checkingMaps.add(digitToWord);
        checkingMaps.add(wordToDigit);
        return checkingMaps;

    }

    public String decryptNumber(String message){


        Map digitToWord = initializeMap().get(0);
        Map wordToDigit = initializeMap().get(1);

        for(int i = 0; i<=9; i++){
            Integer digit = i;
            String word = (String) digitToWord.get(digit.toString());
            if(message.contains(word)){
                String replacement = (String) wordToDigit.get(word);
                message = message.replaceAll(word,replacement);
            }
        }
        return message ;
    }
}
