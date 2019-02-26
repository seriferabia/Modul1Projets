package prWeek3.ex4;

import java.util.Random;

public class Decryptor {
    private NumberChanger1 numberChanger = new NumberChanger1();
    private MathSymbolChanger mathSymbolChanger = new MathSymbolChanger();
    private VowelChanger vowelChanger = new VowelChanger();
    private Rubbish rubbish = new Rubbish();

    public String decrypt(String message){

        message = rubbish.removeRubbish(message);

        message = vowelChanger.decryptVowel(message);

        message = mathSymbolChanger.decryptMathSymbol(message);

        message = numberChanger.decryptNumber(message);

        return message;

    }
}
