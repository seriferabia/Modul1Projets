package Week5;

import Week4.Ex7;
import Week4.Main;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        Integer number = Main.getANumber();
        System.out.println(translateIntoMoves(number));

    }
    public  static boolean isHandshakeNumber(Integer number){

        List<Integer> handshakeNumbers = Arrays.asList(2,5,6,9);
        handshakeNumbers = handshakeNumbers.stream().collect(Collectors.toList());

        return handshakeNumbers.contains(number);
    }
    public static String getHandShakeMove(Integer number){
        if (number==2){
            return "Thumb touches back";
        }
        if (number==5){
            return "Tickles over palm";
        }
        if (number==6){
            return "Bro knock";
        }
        if (number==9){
            return "Thousand knuckles";
        }
        return "";
    }
    public static List<String> translateIntoMoves(Integer number){
        List<String> moves = new ArrayList<>();

        List<Integer> digits = Ex7.getDigits(number);
        for (int element : digits  ) {
            if(isHandshakeNumber(element)){
                moves.add(getHandShakeMove(element));
            }
        }
        return  moves;
    }
    public static boolean areEqual(List<String> list1, List<String> list2){
        if(list1.size()!= list2.size()){
            return false;
        }
        for (int i=0; i<list1.size(); i++ ) {
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;

    }
}
