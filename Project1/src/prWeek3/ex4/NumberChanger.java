package prWeek3.ex4;


import java.util.*;

public class NumberChanger {



    public String encryptNumber(String message){
        String[] letters = message.split("");
        String newMessage = "";
        for (String letter : letters){

            if (isNumeric(letter)) {
                letter = changeNumber(letter);
            }
            newMessage = newMessage + letter;
        }
        return newMessage;
    }

    private boolean isNumeric(String letter) {
        return letter.matches("\\d");
    }

    private String changeNumber(String number){

        if(number.equals("0")){
            return "zero";
        }
        if(number.equals("1")){
            return "one";
        }
        if(number.equals("2")){
            return "two";
        }
        if(number.equals("3")){
            return "three";
        }
        if(number.equals("4")){
            return "four";
        }
        if(number.equals("5")){
            return "five";
        }
        if(number.equals("6")){
            return "six";
        }
        if(number.equals("7")){
            return "seven";
        }
        if(number.equals("8")){
            return "eight";
        }
        if(number.equals("9")){
            return "nine";
        }
        return "";
    }

    public String decryptNumber(String message){

        List<String> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList("zero", "one","two","three","four","five","six","seven","eight","nine"));

        for(int i = 0; i<=9; i++){
            if(message.contains(numbers.get(i))){
                String word = numbers.get(i);
                Integer number = i;
                String replacement = number.toString();

                message = message.replaceAll(word,replacement);
            }
        }
        return message ;
    }

}
