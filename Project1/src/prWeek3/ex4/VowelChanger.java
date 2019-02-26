package prWeek3.ex4;

public class VowelChanger {
    public String encryptVowel(String message){
        String[] letters = message.split("");
        String newMessage = "";

        for(String letter : letters){
            if (letter.matches("[aeiou]")) {
                letter = changeVowelToInt(letter);
            }
            newMessage = newMessage + letter;
        }
        return newMessage;

    }

    private String changeVowelToInt(String letter) {
        if(letter.matches("[aA]")){
            return "4";
        }
        if(letter.matches("[eE]")){
            return "3";
        }
        if(letter.matches("[iI]")){
            return "1";
        }
        if(letter.matches("[oO]")){
            return "8";
        }
        if(letter.equals("U")||letter.equals("u")){
            return "9";
        }
        return "";
    }

    public String decryptVowel(String message){
        String[] letters = message.split("");
        String newMessage = "";

        for(String letter : letters){
            if (letter.matches("[43189]")) {
                letter = changeIntToVowel(letter);
            }
            newMessage = newMessage + letter;
        }
        return newMessage;

    }

    private String changeIntToVowel(String letter){
        if(letter.equals("4")){
            return "a";
        }if(letter.equals("3")){
            return "e";
        }if(letter.equals("1")){
            return "i";
        }if(letter.equals("8")){
            return "o";
        }if(letter.equals("9")){
            return "u";
        }
        return "";
    }
}
