package prWeek9.ex3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String cipher(String text, Integer key){
        return Stream.of(text.split(""))
                .map(e-> shift(e,key))
                .collect(Collectors.joining(""));
    }

    private String  shift(String letter, Integer key) {
        int valueOfLetter =(int) letter.charAt(0);
        if(!Character.isAlphabetic(valueOfLetter)){
            Character sameLetter = (char)valueOfLetter;
            return sameLetter.toString();
        }
        int shiftedValue = valueOfLetter + key;
        if(isCapitalLetter(valueOfLetter)){
            shiftedValue = (shiftedValue -65)%26 + 65;
        }else{
            shiftedValue = (shiftedValue -97)%26 + 97;
        }
        Character newletter = (char)shiftedValue;
        return newletter.toString();
    }

    private Boolean isCapitalLetter(int valueOfLetter){
        return valueOfLetter <=90 ;
    }
}
