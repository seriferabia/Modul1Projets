package prWeek3.ex4;

public class Encryptor {

    private NumberChanger1 numberChanger = new NumberChanger1();
    private MathSymbolChanger mathSymbolChanger = new MathSymbolChanger();
    private VowelChanger vowelChanger = new VowelChanger();
    private Rubbish rubbish = new Rubbish();

    public String encrypt(String message){
        message = numberChanger.encryptNumber(message);
        message = mathSymbolChanger.encryptMathSymbol(message);
        message = vowelChanger.encryptVowel(message);
        message = rubbish.addRubbishSymbol(message);
        return message;

    }
}
