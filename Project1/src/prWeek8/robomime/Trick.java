package prWeek8.robomime;

import prWeek4.ex9.FileReader;

import java.util.List;

public class Trick {
    private static FileReader fileReader = new FileReader();

    public static List<String> getEncryptedTricks(String filePath){
        return fileReader.getLines(filePath);
    }
}
