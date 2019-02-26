package prWeek3.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathSymbolChanger {
    public String encryptMathSymbol(String message){
        String[] letters = message.split("");
        String newMessage = "";

        for(String letter : letters){
            if (isSymbol(letter)) {
                letter = changeSymbolToWord(letter);
            }
            newMessage = newMessage + letter;
        }
        return newMessage;

    }
    private Boolean isSymbol(String letter){
        List<String> symbols = new ArrayList<>();
        symbols.addAll(Arrays.asList("+","-","*","/","%"));
        if(symbols.contains(letter)){
            return true;
        }
        return false;
    }

    private String changeSymbolToWord(String letter) {
        if(letter.equals("+")){
            return "plus";
        }if(letter.equals("-")){
            return "minus";
        }if(letter.equals("*")){
            return "multiply";
        }if(letter.equals("/")){
            return "divide";
        }if(letter.equals("%")){
            return "modulo";
        }
        return "";
    }

    public String decryptMathSymbol(String message){
        List<String> symbolNames = new ArrayList<>();
        symbolNames.addAll(Arrays.asList("plus","minus","multiply","divide","modulo"));

        for(String name : symbolNames){
            if(message.contains(name)){
                String replacementOfName = getSymbol(name);
                message = message.replaceAll(name,replacementOfName);
            }
        }
        return message;
    }

    private String getSymbol(String name) {
        if(name.equals("plus")){
            return "+";
        }if(name.equals("minus")){
            return "-";
        }if(name.equals("multiply")){
            return "*";
        }if(name.equals("divide")){
            return "/";
        }if(name.equals("modulo")){
            return "%";
        }
        return "";
    }
}
