package prWeek8.robomime;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sensor {

    private List<Decryption> decryptions = DecryptionOptions.asList();

    public List<String> getDecryptedTricks(List<String> encryptedTricks) {
        List<String> decryptedTricks = new ArrayList<>();
        for (String encryptedTrick : encryptedTricks) {
            if(decrypt(encryptedTrick).isPresent()) {
                decryptedTricks.add(decrypt(encryptedTrick).get());
            }
        }
        return decryptedTricks;
    }

    private Optional<String> decrypt(String encryptedTrick) {
        for (Decryption decryption : decryptions) {
            if (decryption.isValidDecryption(encryptedTrick)) {
                return Optional.of(decryption.decryptTrick(encryptedTrick));
            }
        }
        return Optional.empty();
    }
}
