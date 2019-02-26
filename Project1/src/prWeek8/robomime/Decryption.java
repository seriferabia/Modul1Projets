package prWeek8.robomime;

public interface Decryption {
    Boolean isValidDecryption(String encryptedTrick);

    String decryptTrick(String encryptedTrick);
}
