package prWeek8.robomime;

import java.util.Optional;

public class ExclamationMark implements Decryption {

    @Override
    public Boolean isValidDecryption(String encryptedTrick) {
        return encryptedTrick.contains("!");
    }

    @Override
    public String decryptTrick(String encryptedTrick) {
      return encryptedTrick.replaceAll("!","");
    }
}
