package prWeek8.robomime;


import java.util.Optional;

public class AndSymbol implements Decryption {
    @Override
    public Boolean isValidDecryption(String encryptedTrick) {
        return encryptedTrick.contains("&");
    }

    @Override
    public String decryptTrick(String encryptedTrick) {
        String decryptedTrick = encryptedTrick.replaceAll("&","");
        return new StringBuilder(decryptedTrick).reverse().toString();
    }
}
