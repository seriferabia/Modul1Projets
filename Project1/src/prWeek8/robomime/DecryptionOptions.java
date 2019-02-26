package prWeek8.robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecryptionOptions {
    public static List<Decryption> asList(){
        return new ArrayList<>(Arrays.asList(new ExclamationMark(),new AndSymbol(),new HashSymbol()));
    }
}
