package prWeek8.robomime;

import java.util.List;

public class RobomimeApplication {
    private static Archive archive = new Archive();
    private static Sensor sensor = new Sensor();
    private static List<String> encryptedTricks = Trick.getEncryptedTricks("prWeek8/robomime/robomime.txt");

    public static void main(String[] args) {
        List<String> decryptedTricks = sensor.getDecryptedTricks(encryptedTricks);
        archive.getUniqueTricks(decryptedTricks);

    }
}
