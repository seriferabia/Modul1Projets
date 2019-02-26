package prWeek8.robomime;

import java.util.Optional;

public class HashSymbol implements Decryption {
    @Override
    public Boolean isValidDecryption(String encryptedTrick) {
        return encryptedTrick.contains("#");
    }

    @Override
    public String decryptTrick(String encryptedTrick) {
        String decryptedTrick = encryptedTrick.replaceAll("#","");
        return decryptedTrick.replaceAll("robomime","");
    }
}
